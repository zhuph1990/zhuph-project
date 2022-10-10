package com.zph.javase.io.readerOrWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class PrintStreamTest {

    public static void main(String[] args) {
        PrintStream printStream = null;
        try {
//            printStream = new PrintStream(new FileOutputStream("src/com/zph/javase/io/tmp/123.txt"));
            printStream = new PrintStream(System.out);
            printStream.write("hello messi ".getBytes());
            printStream.println(true);
            System.out.println();
            //格式化输出 %s：字符串  %d:整数  %f:浮点数
            System.out.printf("%s--%d---%.2f", "suarez", 33, 111.1111);
            System.err.println("barcelona");
        } catch (IOException e) {
            e.printStackTrace();
        }
        printStream.close();
    }
}
