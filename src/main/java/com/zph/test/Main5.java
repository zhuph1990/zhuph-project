package com.zph.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;


public class Main5{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<TreeMap<Integer, Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] split = in.nextLine().split(" ");
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int j = 0; j < split.length; j++) {
                map.put(Integer.parseInt(split[j]), j);
            }
            res.add(map);
        }
        in.close();

        Integer res1 = new ArrayList<>(res.get(0).keySet()).get(0);
        int sum = res1;
        Integer type = res.get(0).get(res1);

        if (res.size() > 1) {
            for (int i = 1; i < res.size(); i++) {
                ArrayList<Integer> keyList = new ArrayList<>(res.get(i).keySet());
                Integer resN = keyList.get(0);
                Integer typeN = res.get(i).get(resN);
                if (!typeN.equals(type)) {
                    sum += resN;
                    type = typeN;
                } else {
                    sum += keyList.get(1);
                    type = res.get(i).get(keyList.get(1));
                }

            }
        }

        System.out.println(sum);
    }
}