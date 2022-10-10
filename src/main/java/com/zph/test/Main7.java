package com.zph.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] sss = str.split(" ");
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (String s : sss) {
            int i = Integer.parseInt(s);
            if (Integer.parseInt(s) > max) {
                max = i;
            }
            list.add(i);
        }

        List<Integer> result = new ArrayList<>();
        for (int j=0; j < list.size(); j++) {
            int current = list.get(j);
            if (result.isEmpty() || current == max) {
                result.add(current);
                continue;
            }
            boolean flag = false;
            for (int k=0; k < result.size(); k++) {
                int xxxxx = result.get(k);
                if (xxxxx + current == max){
                    result.set(k, max);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result.add(current);
            }

        }
        if(result.size()==0){
            System.out.println(-1);
        }else {
            System.out.println(result.size());
        }


    }



}
