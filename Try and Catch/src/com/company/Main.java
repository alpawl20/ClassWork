package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner console= new Scanner(System.in);

        System.out.println("enter a number");
        double num1;
        try {
            num1= Double.parseDouble(console.nextLine());
        }
        catch (NumberFormatException Ex){
            System.out.println("Input 1 is not a number");
            return;
        }

        System.out.println("enter a number");
        double num2;
        try {
            num2= Double.parseDouble(console.nextLine());
        }
        catch (NumberFormatException Ex){
            System.out.println("Input 2 is not a number");
            return;
        }
        System.out.println("enter a number");
        double num3;
        try {
            num3= Double.parseDouble(console.nextLine());
        }
        catch (NumberFormatException Ex){
            System.out.println("Input 3 is not a number");
            return;
        }
        System.out.println("enter a number");
        double num4;
        try {
            num4= Double.parseDouble(console.nextLine());
        }
        catch (NumberFormatException Ex){
            System.out.println("Input 4 is not a number");
            return;
        }
        double total = num1+num2+num3+num4;
        System.out.println("Total is: "+total);
    }
}
