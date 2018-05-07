package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String s = "";
        private String tmp;
        private BufferedReader reader;

        @Override
        public void setFileName (String fullFileName) {
            try {
                reader = new BufferedReader(new FileReader(fullFileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            try {
                while ((tmp = reader.readLine()) != null) {
                    s += tmp + " ";
                }
                reader.ready();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String getFileContent() {
            return s;
        }

    }

    //add your code here - добавьте код тут
}
