package com.zph.javase.io.Stream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 在java中需要读写文件中的数据的话，需要使用流的概念
 * 流表示从一个文件将数据返送到另一个文件，包含一个流向的问题
 * 最终需要选择一个参照物：当前程序作为参照物
 * 从一个文件中读取数据到程序叫做输入流
 * 从程序输出数据到另一个文件叫做输出流
 * <p>
 * 注意：当编写io流的程序的时候一定要注意关闭流
 * 步骤;
 * 1、选择合适的io流对象
 * 2、创建对象
 * 3、传输数据
 * 4、关闭流对象（占用系统资源）
 */

/*
 * 存在问题，每次只能读取一个字节，效率比较低，需要循环N多次
 * */
public class InputStreamDemo2 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/com/zph/javase/io/tmp/playerName.txt");
            int read = 0;
            //循环输出所有的字节，
            while ((read = inputStream.read()) != -1) {
                System.out.println((char) read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
