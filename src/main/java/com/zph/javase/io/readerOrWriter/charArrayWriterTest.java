package com.zph.javase.io.readerOrWriter;

import java.io.CharArrayWriter;


public class charArrayWriterTest {

    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write(97);
        charArrayWriter.write(98);
        charArrayWriter.write(99);
        System.out.println(charArrayWriter);
        charArrayWriter.close();
    }
}
