package com.zph.test;

import java.util.*;

public class Main6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        List<coordinate> list = new ArrayList();
        for (; numb > 0; numb--) {
            list.add(new coordinate(sc.nextInt(), sc.nextInt()));
        }
        List<List> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                for (int x = j + 1; x < list.size(); x++) {
                    for (int y = x + 1; y < list.size(); y++) {
                        if (getResult(list.get(i), list.get(j), list.get(x), list.get(y))) {
                            List<coordinate> re1 = new ArrayList();
                            re1.add(list.get(i));
                            re1.add(list.get(j));
                            re1.add(list.get(x));
                            re1.add(list.get(y));
                            if (result.isEmpty()) {
                                result.add(re1);
                                continue;
                            }
                            boolean flag = false;
                            for (List ls : result) {
                                if (ls.containsAll(re1)) {
                                    flag = true;
                                }
                            }
                            if (!flag) {
                                result.add(re1);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(result.size());

    }

    //两点距离
    public static double getjuli(coordinate d1, coordinate d2) {
        return Math.sqrt((d1.x - d2.x) * (d1.x - d2.x) + (d1.y - d2.y) * (d1.y - d2.y));
    }

    public static boolean getResult(coordinate d1, coordinate d2, coordinate d3, coordinate d4) {
        List<Double> set = new ArrayList<>();
        set.add(getjuli(d1, d2));
        set.add(getjuli(d1, d3));
        set.add(getjuli(d1, d4));
        set.add(getjuli(d2, d3));
        set.add(getjuli(d2, d4));
        set.add(getjuli(d3, d4));
        Collections.sort(set);
        if (set.get(0).equals(set.get(1)) &&
                set.get(2).equals(set.get(3)) &&
                set.get(3).equals(set.get(4)) && set.get(4).equals(set.get(5))) {
            return true;
        }
        if (set.get(0).equals(set.get(1)) &&
                set.get(1).equals(set.get(2)) &&
                set.get(2).equals(set.get(3)) && set.get(4).equals(set.get(5))) {
            return true;
        }
        return false;
    }

    static class coordinate {
        public int x = 0;
        public int y = 0;

        coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            coordinate that = (coordinate) o;
            return x == that.x && y == that.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

}
