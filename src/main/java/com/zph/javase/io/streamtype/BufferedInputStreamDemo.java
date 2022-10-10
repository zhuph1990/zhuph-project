package com.zph.javase.io.streamtype;

import java.io.*;


public class BufferedInputStreamDemo {
    public static void main(String[] args) {

        File file = new File("src/com/zph/javase/io/tmp/onMatchNameV1.txt");
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            int read = 0;
            while ((read = bufferedInputStream.read()) != -1) {
                bufferedInputStream.skip(6);
                System.out.print((char) read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
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
