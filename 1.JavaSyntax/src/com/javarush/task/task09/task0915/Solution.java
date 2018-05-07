package com.javarush.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Перехват выборочных исключений
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            processExceptions();
        }
        catch (FileSystemException e){
            e.printStackTrace();
            BEAN.log(e);
        }
    }

    public static void processExceptions() throws  FileSystemException {

        StatelessBean statelessBean = new StatelessBean();
        try {
            BEAN.methodThrowExceptions();
        }
        catch (CharConversionException e) {
            e.printStackTrace();
            statelessBean.log(e);
        }
        catch (FileSystemException e) {
            e.printStackTrace();
            statelessBean.log(e);
            throw new FileSystemException("");
        }
        catch (IOException e) {
            e.printStackTrace();
            statelessBean.log(e);
        }


    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
