package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        byte[] bytes;
        int key = 3;
        switch (args[0]) {
            case ("-e") :
                try {
                    FileInputStream fis = new FileInputStream(args[1]);
                    FileOutputStream fos = new FileOutputStream(args[2]);
                    bytes = new byte[fis.available()];
                    fis.read(bytes);
                    bytes = encryption(bytes, key);
                    fos.write(bytes);
                    fis.close();
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case ("-d") :
                try {
                    FileInputStream fis = new FileInputStream(args[1]);
                    FileOutputStream fos = new FileOutputStream(args[2]);
                    bytes = new byte[fis.available()];
                    fis.read(bytes);
                    bytes = decryption(bytes, key);
                    fos.write(bytes);
                    fis.close();
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

        }
    }
    public static byte[] encryption(byte[] bytes, int key) {
        byte[] encrypted = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] > 64 && bytes[i] < 91){
                if (bytes[i] + key > 90) {
                    encrypted[i] = (byte) ((bytes[i]+ key) - 25);
                } else encrypted[i] = (byte) (bytes[i] + key);
            } else if (bytes[i] > 96 && bytes[i] < 123) {
                if (bytes[i] + key > 122) {
                    encrypted[i] = (byte) ((bytes[i] + key) - 25);
                } else encrypted[i] = (byte) (bytes[i] + key);
            } else encrypted[i] = bytes[i];
        }
        return encrypted;
    }

    public static byte[] decryption(byte[] bytes, int key) {
        byte[] decrypted = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] > 64 && bytes[i] < 91){
                if (bytes[i] - key < 65) {
                    decrypted[i] = (byte) ((bytes[i] -key) + 25);
                } else decrypted[i] = (byte) (bytes[i] - key);
            } else if (bytes[i] > 96 && bytes[i] < 123) {
                if (bytes[i] - key < 97) {
                    decrypted[i] = (byte) ((bytes[i] - key) + 25);
                } else decrypted[i] = (byte) (bytes[i] - key);
            } else decrypted[i] = bytes[i];
        }
        return decrypted;
    }
}
