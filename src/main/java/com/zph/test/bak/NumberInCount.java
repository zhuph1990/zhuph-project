package com.zph.test.bak;

import java.util.Scanner;

/**
 * @auther Zhuph
 * @date 2019/10/14 17:45
 */
public class NumberInCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int [] arr = new int[6];
            int sum = 0;
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }

            for (int i = 1; i < arr.length; i++)
            {

                if(arr[i] < arr[0])
                {
                    sum += arr[i];
                }

            }
            System.out.println(sum);
        }
        sc.close();
    }
}
