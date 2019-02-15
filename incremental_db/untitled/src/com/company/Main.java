package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner console = new Scanner(System.in);
        //create a program that calculates the average of three numbers entered as input:
        System.out.println("Enter a number:");
       int number1 = Integer.parseInt(console.nextLine());
       System.out.println("Enter a number:");
       int number2 = Integer.parseInt(console.nextLine());
       System.out.println("Enter a number:");
       int number3 = Integer.parseInt(console.nextLine());
       double average;
       average=(number1+number2+number3)/3.0;
       //average=average/3;
        System.out.println("The average is:");
        System.out.println(average);




        // asks for 3 numbers(could be decimal values) using the following prompt each time:



        // "Enter a number:"//add the three numbers together and prints out the result divided by 3 (average) with the following prompt



        // "The average is: " followed by the average value.
    }
}
