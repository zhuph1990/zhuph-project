package com.zph.javase.io.readerOrWriter;

import java.io.*;


public class CopyPicture {
    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("src/com/zph/javase/io/tmp/logo1.jpg");
            fileOutputStream = new FileOutputStream("src/com/zph/javase/io/tmp/logo2.jpg");

            int length = 0;
            byte[] buffer = new byte[1024];
            while ((length = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
