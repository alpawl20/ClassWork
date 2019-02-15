package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
    /* Create a program that will take a test score as an input from the user prompt using the following line:
    Enter a score:
    and print out the letter grade they recieved use
    this scale:
    100-93 :A
    92-90  :A-
    89-87  :B+
    86-83  :B
    82-80  :B-
    79-77  :C+
    76-73  :C
    72-70  :C-
    69-67  :D+
    66-63 :D
    62-60  :D-
    <60    :E

    You may assume that they will only enter whole numbers and the numbers
    will be in the range of 0-100 Test Case*/
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a score:");
        int number1 = Integer.parseInt((console.nextLine()));
        System.out.println("Your Grade:");

        if (number1 >= 93) {
            System.out.println("A");
        }
       else if (number1 >= 90) {
            System.out.println("A-");
        }
        else if (number1 >=87){
            System.out.println("B+");
        }
        else if (number1 >=83){
            System.out.println("B");
        }
        else if (number1 >=80){
            System.out.println("B-");
        }
        else if (number1 >=77){
            System.out.println("C+");
        }
        else if (number1 >=73){
            System.out.println("C");
        }
        else if (number1 >=70){
            System.out.println("C-");
        }
        else if (number1 >=67) {
            System.out.println("D+");
        }
        else if (number1 >=63) {
            System.out.println("D");
        }
        else if (number1 >=60) {
            System.out.println("D-");
        }
        else if (number1 >=0) {
            System.out.println("E");
        }

    }

}


