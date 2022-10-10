package com.zph.javase.io.streamtype;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(123);
        try {
            byteArrayOutputStream.write(" www.messi.com ".getBytes());
            byteArrayOutputStream.write(125);
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
