package com.zph.test;

import java.util.*;

public class Main3 implements Comparable {
    int index;//任务标记
    int b;//交代任务时间
    int j; //执行任务时间

    public Main3(int index,int b, int j) {
        this.index = index;
        this.b = b;
        this.j = j;
    }

    /**
     * 重新比较方法，实现由大到小排列
     */
    @Override
    public int compareTo(Object m) {
        return (j > ((Main3) m).j ? -1 : (j == ((Main3) m).j) ? 0 : 1);
    }

    public static void main(String arg[]) {
        Scanner cin = new Scanner(System.in);
        int casenum=0;
        while (cin.hasNext()) {
            final int n = cin.nextInt();
            Main3[] m = new Main3[n];
            for (int i = 0; i < n; i++) {
                m[i]=new Main3(i+1,cin.nextInt(),cin.nextInt());
            }
            Arrays.sort(m);
            int time=0,temp=0;
            System.out.print("1~ n的一个排列:");
            int aa = 0;
            for(int i=0;i<n;i++){
                aa = m[i].index;
                if (i != n-1) {
                    System.out.print(",");
                }else{
                    System.out.println();
                }
                time+=m[i].b;
                if((temp-=m[i].b)<=0)temp=0;
                if(temp<m[i].j)temp=m[i].j;
            }
            time+=temp;
            System.out.println("Case "+(++casenum)+"(所有任务的完成时间): "+time);
            System.out.println(time + aa);
        }
    }

}