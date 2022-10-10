package com.zph.javase.io.readerOrWriter;

import java.io.*;


public class BufferedReaderTest {
    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("src/com/zph/javase/io/tmp/Football.txt"));
            String read = null;
            while ((read = reader.readLine()) != null) {
                System.out.println(read);
            }
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
