package com.module_2_3;

import java.util.Scanner;
import com.welcome.Hello;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Hello hello = new Hello();

        System.out.println("Your name?");
        String name = scanner.nextLine();
        hello.setupName(name);

        hello.welcome();
        System.out.println("Hello, world!");
        hello.byeBay();

        scanner.close();
    }
}

