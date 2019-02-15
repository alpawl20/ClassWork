package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*Create a program that will simulate savings in the stock market.
The program should prompt for several input using the following prompts:
Enter Starting Balance:
Enter Yearly Contribution:
Enter Average Return On Investment as %:
Enter Number of years:
The program should calculate the balance at the end of each year.

Sample input:		Sample Output:
					Enter Starting Balance in dollars
1000
					Enter Yearly Contribution in dollars
100
					Enter Average Return on Investment as %
5
					Enter Number of years for the report.
3
					Year 0: 1000.00
					Year 1: 1155.00
					Year 2: 1317.75
					Year 3: 1488.64
*/
Scanner console = new Scanner (System.in);
System.out.println("Enter Starting Balance: ");
double ESB;
try{ ESB  = Integer.parseInt(console.nextLine());}
catch (NumberFormatException Ex){
    System.out.println("This input is not a number");
    return;
}
System.out.println("Enter Yearly Contribution: ");
double EYC;
try { EYC = Integer.parseInt(console.nextLine());}
catch (NumberFormatException Ex){
    System.out.println("This input is not a number");
    return;
}
System.out.println("Enter Average Return on Investment as %: ");
double ARI;
try { ARI = Integer.parseInt(console.nextLine());}
        catch (NumberFormatException Ex){
            System.out.println("This input is not a number");
            return;
        }
        ARI = ARI/100;
System.out.println("Enter Number of years for the report: ");
        double ENY;
        try { ENY = Integer.parseInt(console.nextLine());}
        catch (NumberFormatException Ex){
            System.out.println("This input is not a number");
            return;
        }
        int X= 1;
       System.out.println("Year 0:" +ESB);
        while (X<ENY+1) {

           ESB = ESB+EYC;
        ESB = ESB+ ESB*ARI;
        System.out.println("Year "+X+":" + ESB );
       X = X+1;}
    }
}
