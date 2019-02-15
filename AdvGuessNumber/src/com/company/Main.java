package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //creating a function named Input
    static String Input(String prompt){
        //This will print the prompt
        System.out.println(prompt);
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }
    //creating function named IntInput
    static int IntInput (String prompt){
        int X=0;
        while (true) {
       //making sure a number is entered
        try {
            int number = Integer.parseInt(Input(prompt));
            return number;
        }
        //if a number is not entered it will ask for a number
        catch (NumberFormatException ex) {
            System.out.println("Invalid input, Please enter a number");
        }
    }
    }
    //creating a function named GenerateNumber
    static int GenerateNumber(){
        //creating the random number
        Random rand = new Random();
        //putting that number into an integer
        int n = rand.nextInt(100) +1;
        return n;
    }
    //creating a function named GetGuess
    static int GetGuess(){
        while(true){
            //putting the number entered into an integer named guess
        int guess =IntInput("\nEnter a number between 1 and 100: ");
        //telling you to enter a number within the instructions
         if(guess>100) {
             System.out.println("Number is larger than 100");
         }
         else if(guess<1){
             System.out.println("Number is smaller than 1");}
             else {
             return guess;
         }

        }
    }
    int guess=GetGuess();
    //creating a function named PrintHint
    static void printHint (int n,int guess){
            //printing hints
            if (guess < n) {
                System.out.println("Your number was too small");
            } else if (guess > n) {
                System.out.println("Your number was too large");
            }
        }
    //creating a function named CheckGuess
    static boolean CheckGuess (int n, int guess) {
        //if the secret number is not equal to the guess
        if (n != guess) {
            //print a hint telling whether its too high or too low
            printHint(n,guess);
            //return it as false
            return false;
        }
        //else if it is true print true
        return true;
    }

    /*Test Cases
    -negative numbers
    -numbers bigger than instructed to enter
    -anything other than numbers entered

    */
    public static void main(String[] args) {


	// write your code here
        String name = Input("Enter your name");
        while(true) {
            int tracker = 1;
            int secret = GenerateNumber();
            int guess = GetGuess();
            while (!CheckGuess(secret, guess)) {
                guess = GetGuess();
                tracker++;
            }
            System.out.println("Congrats, " + name + "! It took you " + tracker + " guess(es) to get it right!");
            String choice = Input("\n Would you like to play again?(yes/no)");
            if (choice.toLowerCase().equals("no")) {
                System.exit(0);
            }
        }



        }


    }

