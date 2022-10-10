package com.zph.test.bak;

import java.util.Scanner;

/**
 * @auther Zhuph
 * @date 2019/10/14 11:25
 */
public class CharReverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String inputString = sc.nextLine();
            StringBuilder sb = new StringBuilder(inputString);
            System.out.println(sb.reverse().toString());
        }

    }
}
