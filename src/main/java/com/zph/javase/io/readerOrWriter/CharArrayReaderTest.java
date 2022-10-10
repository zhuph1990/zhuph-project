package com.zph.javase.io.readerOrWriter;

import java.io.CharArrayReader;
import java.io.IOException;


public class CharArrayReaderTest {
    public static void main(String[] args) {

        char[] chars = "梅西".toCharArray();
        CharArrayReader charArrayReader = new CharArrayReader(chars);
        try {
            int read = 0;
            while((read = charArrayReader.read())!=-1){
                System.out.println((char)read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            charArrayReader.close();
        }

    }
}
