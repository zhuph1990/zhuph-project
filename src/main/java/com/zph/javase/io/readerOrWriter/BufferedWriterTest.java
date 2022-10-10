package com.zph.javase.io.readerOrWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterTest {

    public static void main(String[] args) {

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter =  new FileWriter(new File("src/com/zph/javase/io/tmp/Soccer.txt"));
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append("曼城City");
            bufferedWriter.newLine();
            bufferedWriter.append("曼联United");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
