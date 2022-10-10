package com.zph.javase.io.commonsio;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;
import java.util.Collection;


public class Commons_ioTest {

    public static void main(String[] args) {
       long length =  FileUtils.sizeOf(new File("src/com/zph/javase/io/tmp/baidu.html"));
       System.out.println(length);
       Collection<File> files = FileUtils.listFiles(new File("c:"), EmptyFileFilter.NOT_EMPTY, null);
       for (File file:files){
            System.out.println(file.getAbsolutePath());
       }
    }
}
