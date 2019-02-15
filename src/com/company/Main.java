package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
     ////Use the below for Java:
        Scanner console= new Scanner(System.in);
        System.out.println("enter a number");
        double num1 = Double.parseDouble(console.nextLine());
        try {Double.parseDouble(console.nextLine());}
        catch {
            System.out.println("Input 1 was not a number");
        }
        System.out.println("enter a number");
        double num2 = Double.parseDouble(console.nextLine());
     System.out.println("enter a number");
     double num3 = Double.parseDouble(console.nextLine());
     System.out.println("enter a number");
     double num4 = Double.parseDouble(console.nextLine());
     double total = num1+num2+num3+num4;
     System.out.println("Total is: "+total);
    }
}
