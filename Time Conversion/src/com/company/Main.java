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
        Scanner console = new Scanner(System.in);
        System.out.println("Enter hour for 12 hr time format:");
        int hrnumber = Integer.parseInt(console.nextLine());
        if (hrnumber >= 12 || hrnumber < 0){
            System.out.println("Please enter a number kn 12 hour format");
        }
        System.out.println("Enter min for 12 hour format:");
        int minnumber = Integer.parseInt(console.nextLine());
        if (hrnumber >= 60 || hrnumber < 0){
            System.out.println("Please enter a number kn 12 hour format");
        }
        System.out.println("Enter sec for 12 hour format:");
        int secnumber = Integer.parseInt(console.nextLine());
        if (hrnumber >= 60 || hrnumber < 0){
            System.out.println("Please enter a number kn 12 hour format");
        }
        System.out.println("Enter AM/PM:");
        String AMPM = (console.nextLine());
        if (AMPM.equalsIgnoreCase("pm")){
            hrnumber = hrnumber + 12;
        }

    }
}
