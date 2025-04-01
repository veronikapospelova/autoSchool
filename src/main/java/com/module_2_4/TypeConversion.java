package com.module_2_4;

import java.math.BigDecimal;
import java.util.Scanner;

public class TypeConversion
{
    public static void main(String[] args)
    {
        //first();
        //second();
        //third();
        fourth();
    }

    public static void first()
    {
        //int q = 21;
        //int w = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter q:");
        int q = scanner.nextInt();
        System.out.println("Enter w:");
        int w = scanner.nextInt();

        System.out.println(q + " / " + w + " = " + (q / w) + " и " + (q % w) + " в остатке");
    }

    public static void second()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two-digit number:");
        int n = scanner.nextInt();
        int firstDigit = n / 10;
        int secondDigit = n % 10;
        System.out.println("Sum = " + (firstDigit + secondDigit));
    }

    public static void third()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter double number:");
        double n = scanner.nextDouble();
        int roundN = (int) (n + 0.5);           //!!!!!!!!! but 4.45
        //int roundN = Math.round(n);

        System.out.println("Rounded number = " + roundN);
    }

    public static void fourth()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter c:");
        int c = scanner.nextInt();

        int previousA = a;
        int previousB = b;
        int previousC = c;
        a = previousA + previousB;
        b = previousC - previousA;
        c = previousA + previousB + previousC;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
