package com.zph.test.bak;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther Zhuph
 * @date 2019/10/14 11:18
 */
public class StringInTurnInside
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext())
        {
            String str = sc.nextLine();
            char array [] = str.toCharArray();
            Arrays.sort(array);
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i]);
            }
            System.out.println();
        }
        sc.close();

    }
}
