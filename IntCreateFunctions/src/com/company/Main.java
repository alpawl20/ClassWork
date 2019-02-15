package com.company;

public class Main {
    //Function Name: MyPrintFunction
    static void MyPrintFunction(){
        //What it should do: Print the message: "In MyPrintFunction"
        System.out.println("In MyPrintFunction");
        return;
    }

    //Function Name: BobPrinter
    static void BobPrinter(){
        //What it should do: Print the message: "bob bob bob bob bob"
        System.out.println("bob bob bob bob bob");
        return;
    }
    //Inputs: none
    //What it should do: Print the message: "bob bob bob bob bob"
    //Returns: nothing

    //Function Name: Add
    static int Add (int num1,int num2){
        int num3=num1+num2;
        System.out.println(num3);
        return num3;
    }
    //Inputs: 2 integers (num1 and num2)
    //What it should do: add num1 and num2
    //Returns: the integer that is result of adding num1 and num2 together

    //Function Name: Sub
    static int Sub(int num1,int num2){
        int num3=num2-num1;
        System.out.println(num3);
        return num3;

    }
    //Inputs: 2 integers (num1 and num2)
    //What it should do: subtract num2 from num1
    //Returns: the integer that is result of subtracting num2 from num1


    //Function Name: Add1
    static int Add1 (int num1){
        num1=num1+1;
        System.out.println(num1);
        return num1;
    }
    //Inputs: 1 integer
    //What it should do: add 1 to the integer
    //Returns: the new integer


    public static void main(String[] args) {
	// write your code here
        MyPrintFunction();
        MyPrintFunction();
        MyPrintFunction();
        BobPrinter();
        BobPrinter();
        BobPrinter();
        Add(7,2);
        Add(43,4);
        Add(5, 4);
        Sub(3,4);
        Sub(2,5);
        Sub(1,7);
        Add1(2);
        Add1(45);
        Add1(99);
    }
}
