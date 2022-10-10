package com.zph.test.bak;

import java.util.Scanner;

/**
 * @auther Zhuph
 * @date 2019/10/14 11:07
 */
public class NumberReverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int out = rev(rev(m)+rev(n));
        System.out.println(out);
    }

    public static  int rev(int num)
    {
        int x = 0;
        while(num!=0)
        {
            x = 10*x + num%10;
            num = num/10;
        }
        return x;
    }
}
