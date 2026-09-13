//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
package com.clementelindsey;

import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutt
public class Main {

    public static void main(String[] args)

    {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
