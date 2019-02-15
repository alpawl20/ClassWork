package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*Create a program that takes two numbers as inputs and prints out all of the prime numbers (in increasing value)
        between those two numbers(inclusive).
                Prompt for two numbers using the following prompt twice:
        enter a number:

        Remember: A prime number is a [positive whole] number that is only divisible by it self and 1. Also 1 is not a prime number.

                Example Input		Example Output

        enter a number:
        1
        enter a number:
        7
        2
        3
        5
        7

        Example Input		Example Output

        enter a number:
        14
        enter a number:
        7
        7
        11
        13


        Test Cases
        Negative Numbers
        Bigger number being entered first
        if no number was entered */

        //psuedo code
        //ask user for number
        //if no number is entered end program
        //create int for each number
        //if bigger number is entered first, switch the values
        //add 1 to X to exclude 1 from being prime
        // create a loop
        //create a boolean
        //create a function to find the prime numbers
        //put the function in the boolean
        //if x is prime print out the number
        //if x is not prime, X=X+1

        Scanner console = new Scanner(System.in);
        System.out.println("enter a number: ");
        int ean1;
        try {
            ean1 = Integer.parseInt(console.nextLine());
        } catch (NumberFormatException Ex) {
            System.out.println("enter a number: ");
            return;
        }
        System.out.println("enter a number: ");
        int ean2;
        try {
            ean2 = Integer.parseInt(console.nextLine());
        } catch (NumberFormatException Ex) {
            System.out.println("enter a number: ");
            return;
        }
        int X = ean1;
        int i = ean2;

        if (X>i){
            int temp = X;
            X=i;
            i=temp;

        }

        if(X<=1){
            X=2;

        }
        //make X be the smaller number


        //go through all numbers between 2 inputs
        while (X <= i ) {

            //find if X is prime
            boolean xIsPrime = FindIfXisPrime(X);
           //if X is prime print X
            if (xIsPrime ){
                System.out.println(X);
            }
           X = X + 1;

        }
    }
    static boolean FindIfXisPrime(int X){
        boolean isPrime = true;
        //go through all numbers up to x/2
        int startNum = 2;
        while (startNum<(X/2+1)){
            if (X % startNum == 0) {
                isPrime = false;
                break;
            }
            startNum++;
        }
        return isPrime;
    }
}


