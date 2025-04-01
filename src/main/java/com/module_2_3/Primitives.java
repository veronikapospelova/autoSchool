package com.module_2_3;

import java.util.Scanner;

public class Primitives
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
        printHelloName();
    }

    public static void printHelloName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        scanner.close();
    }
}
