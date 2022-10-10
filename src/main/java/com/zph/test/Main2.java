package com.zph.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextLine());
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(calc(o1), calc(o2));
            }
        });

        for (String s : list) {
            System.out.println(s);
        }
        in.close();
    }

    static int calc(String str) {
        int size = 0;
        String upper = str.toUpperCase();
        String[] split = upper.split("[A-Z]");
        int length = 0;
        for (String s : split) {
            length += s.length();
            int num = Integer.parseInt(s);
            String substring = upper.substring(length, length + 1);
            switch (substring) {
                case "M":
                    size += num;
                    break;
                case "G":
                    size += num * 1024;
                    break;
                case "T":
                    size += num * 1024 * 1024;
                    break;
            }
            length++;
        }
        return size;
    }
}