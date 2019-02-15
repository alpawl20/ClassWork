package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

You program should ask for the time using the following prompts:
Enter hour for 12 hr time format:
Enter min for 12 hr time format:
Enter sec for 12 hr time format:
Enter AM/PM:

your program should convert and print the given time in 24-hour format.


Example input		Example output

					Enter hour for 12 hr time format:
07
					Enter min for 12 hr time format:
05
					Enter sec for 12 hr time format:
45
					Enter AM/PM:
PM
					19:05:45

Example input		Example output

					Enter hour for 12 hr time format:
12
					Enter min for 12 hr time format:
08
					Enter sec for 12 hr time format:
59
					Enter AM/PM:
AM
					00:08:59
*/







                int minnumber = 0;
                int hrnumber = 0;

                Scanner console = new Scanner(System.in);
                System.out.println("Enter hour for 12 hr time format:");
                try {
                    hrnumber = Integer.parseInt(console.nextLine());
                }
                catch (NumberFormatException ex){
                    System.out.println("Please enter a number");
                    System.exit(0);
                }
                if (hrnumber > 12 || hrnumber < 0){
                    System.out.println("Please enter a number in 12 hour format");
                    return;
                }
                System.out.println("Enter min for 12 hour format:");

        try {
            minnumber = Integer.parseInt(console.nextLine());
        }
        catch (NumberFormatException ex){
            System.out.println("Please enter a number");
            System.exit(0);
        }
                 minnumber = Integer.parseInt(console.nextLine());
                if (minnumber >= 60 || minnumber < 0){
                    System.out.println("Please enter a number in 12 hour format");
                    return;
                }
        int secnumber = 0;
                try {
            secnumber = Integer.parseInt(console.nextLine());
        } catch (NumberFormatException ex){
            System.out.println("Please enter a number");
            System.exit(0);
        }
                System.out.println("Enter sec for 12 hour format:");
                 secnumber = Integer.parseInt(console.nextLine());
                if (secnumber >= 60 || secnumber < 0){
                    System.out.println("Please enter a number in 12 hour format");
                    return;
                }
                System.out.println("Enter AM/PM:");
                String AMPM = (console.nextLine());
                if (AMPM.equalsIgnoreCase("pm")){
                   hrnumber = hrnumber + 12;
                }
                System.out.print("Military time is ");
                System.out.printf("%02d",hrnumber);
                System.out.print(":");
                System.out.printf("%02d",minnumber );
                System.out.printf(":");
                System.out.printf("%02d",secnumber );
            }
        }



