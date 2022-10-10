package com.zph.javase.io.streamtype;

import java.io.*;


public class DataDemo {
    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            //向文件中写入数据流
            fileOutputStream = new FileOutputStream("src/com/zph/javase/io/tmp/player.txt");
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(123);
            dataOutputStream.writeShort(344);
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.writeUTF("www.messi.com 梅西金球奖");

            //从文件读取数据流
            fileInputStream = new FileInputStream("src/com/zph/javase/io/tmp/player.txt");
            dataInputStream = new DataInputStream(fileInputStream);
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
