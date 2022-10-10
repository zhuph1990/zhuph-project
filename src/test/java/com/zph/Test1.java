package com.zph;

import com.mchange.v2.util.CollectionUtils;
import com.zph.test.Main;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Test1 {


    @Test
    public void test() {
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            int num = (int) ((Math.random() * 100) + 1);
            list.add(num);
        }
        System.out.println(list.toString());
    }

    @Test
    public void test2() {
        long startTime = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            int num = (int) ((Math.random() * 100) + 1);
            list.add(num);
        }
        long middleTime = System.currentTimeMillis();
        System.out.println("costTime1: " + (middleTime - startTime) / 1000);
        batchExecuteCal(list, 10);
        System.out.println("costTime2: " + (System.currentTimeMillis() - middleTime) / 1000);
    }

    public synchronized static <T> boolean batchExecuteCal(List<T> list, int threadCount) {
        boolean isExecutedSuccess = true;
        if (list.size() == 0 || threadCount <= 0) {
            isExecutedSuccess = false;
        }
        Semaphore semaphore = new Semaphore(threadCount);
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        for (T number : list) {
            try {
                semaphore.acquire();
                executorService.execute(() -> {
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(number);
                    semaphore.release();
                });
            } catch (InterruptedException e) {
                System.out.println("--------occur exception... --------" + e);
                isExecutedSuccess = false;
            }

        }
        return isExecutedSuccess;
    }

    @Test
    public void test3() {
        String str = "azAZ09";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println((int)chars[i]);
        }
      //  System.out.println(str.toCharArray());
    }
}
