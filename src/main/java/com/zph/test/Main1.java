package com.zph.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //4 2 7 3 0
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        arr.sort(new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                return (int)o2 - (int)o1;
            }
        });
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            for (int j = i+1; j < arr.size(); j++) {
                int second = arr.get(j);
                for (int k = j+1; k < arr.size(); k++) {
                    int thred = arr.get(k);
                    if (current == second + thred + thred) {
                        System.out.println(current + " " + second + " " + thred);
                        return;
                    }
                }
            }
        }
        System.out.println("0");
    }
}
