package com.zph.test.bak;

import java.util.Scanner;

/**
 * @auther Zhuph
 * @date 2019/10/14 17:32
 */
public class CountUpperCharacterCounts
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String inputString = sc.nextLine();
            char [] ch = inputString.toCharArray();
            int nums = 0;
            for (int i = 0; i < ch.length ; i++)
            {
                if(ch[i] >= 'A' && ch[i] <= 'Z')
                {
                    nums++;
                }
            }
            System.out.println(nums);

        }
    }
}
