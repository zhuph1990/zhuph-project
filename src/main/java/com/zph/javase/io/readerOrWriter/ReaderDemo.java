package com.zph.javase.io.readerOrWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


/**
 * 字符流可以直接读取中文汉字，而字节流在处理的时候会出现中文乱码
 */
public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("src/com/zph/javase/io/tmp/clubName.txt");
            int read = reader.read();
            System.out.println((char) read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
