package com.LickinHeights;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("do u want a pizza?");
        String Answer= keyboard.nextLine();
        
    if ((Answer.equalsIgnoreCase("yes")) {
            System.out.println("you get a pizza");
        }

        else {
            System.out.println("Then I will have it!");
        }






















    }

}
