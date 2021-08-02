package com.keyword;

import java.util.Scanner;

public class RelationalEqualityOperators
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1 or 0: ");
        int number = in.nextInt();
        if (number==1)
            System.out.println("Correct");
        if (number!=1)
            System.out.println("Incorrect");
    }
}
