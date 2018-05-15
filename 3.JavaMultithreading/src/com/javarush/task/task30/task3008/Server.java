package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();
    public static void main(String[] args) throws IOException {
        ConsoleHelper.writeMessage("Enter the port number");
        int port = ConsoleHelper.readInt();
        try (ServerSocket ss = new ServerSocket(port)) {
            ConsoleHelper.writeMessage("The server was started");
            while(true) {
                Socket socket = ss.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (Exception e) {
            System.out.println("Unexpected error");
        }
    }

    public static void sendBroadcastMessage(Message message) {
        try {
            for (Connection connection : connectionMap.values()) {
                connection.send(message);
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Error sending a message");
        }
    }

    private static class Handler extends Thread {
        Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            String name = null;
            ConsoleHelper.writeMessage("Connected to a new user: " + socket.getRemoteSocketAddress());
            try (Connection connection = new Connection(socket)) {
                name = serverHandshake(connection); // get name
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, name)); // send all users name new user
                sendListOfUsers(connection, name); // send user list users
                serverMainLoop(connection, name); // send/receive massages
            } catch (IOException |ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Unexpected error");
            } finally {
                if (name != null) {
                    connectionMap.remove(name);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, name)); // send all users name removed user
                    ConsoleHelper.writeMessage("Connection with remote address is closed");
                }
            }
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message message = connection.receive();
                if (message.getType() == MessageType.USER_NAME) {
                    if (message.getData() != null && !message.getData().isEmpty()) {
                        if (connectionMap.get(message.getData()) == null) {
                            connectionMap.put(message.getData(), connection);
                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            return message.getData();
                        }
                    }
                }
            }
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            for (String key : connectionMap.keySet()) {
                Message message = new Message(MessageType.USER_ADDED, key);

                if (!key.equals(userName)) {
                    connection.send(message);
                }
            }
        }
        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    Message newMessage = new Message(MessageType.TEXT, userName + ": " + message.getData());
                    Server.sendBroadcastMessage(newMessage);
                } else {
                    ConsoleHelper.writeMessage("Error sending a message");
                }
            }
        }
    }
}
