package com.zph.javase.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * 分块读取文件
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        File file = new File("src/com/zph/javase/io/tmp/zhiboba.txt");
        //整个文件的大小
        long length = file.length();
        //规定块的大小
        int blockSize = 1024;
        //文件可以被切分成多少个块
        int size = (int) Math.ceil(length * 1.0 / blockSize);
        System.out.printf("This file will be cut into {%d} pieces ", size);

        int beginPos = 0;
        int actualSize = (int) (blockSize > length ? length : blockSize);
        for (int i = 0; i < size; i++) {
            //每次读取块的时候的起始偏移量
            beginPos = i * blockSize;
            if (i == size - 1) {
                actualSize = (int) length;
            } else {
                actualSize = blockSize;
                length -= actualSize;
            }
            System.out.println(i + "---> begin position is ：" + beginPos + "---->read size is ：" + actualSize);
            readSplit(i, beginPos, actualSize);
        }
    }

    public static void readSplit(int i, int beginPos, int actualSize) {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(new File("src/com/zph/javase/io/tmp/zhibobaV1.txt"), "r");
            //表示从哪个偏移量开始读取数据
            randomAccessFile.seek(beginPos);
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = randomAccessFile.read(bytes)) != -1) {
                if (actualSize > length) {
                    System.out.println(new String(bytes, 0, length));
                    actualSize -= length;
                } else {
                    System.out.println(new String(bytes, 0, actualSize));
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
