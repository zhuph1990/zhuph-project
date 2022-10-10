package com.zph.javase.io.streamtype;

import java.io.ByteArrayInputStream;
import java.io.IOException;


public class ByteArrayInputStreamDemo {

    public static void main(String[] args) {

        String str = "www.messi.com";
        byte[] buffer = str.getBytes();
        ByteArrayInputStream byteArrayInputStream = null;
        byteArrayInputStream = new ByteArrayInputStream(buffer);
        int read = 0;
        while ((read = byteArrayInputStream.read()) != -1) {
            byteArrayInputStream.skip(4);
            System.out.println((char) read);
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
