package com.company;

/**
 * Created by ap1150 on 2/5/2019.
 */
public class RussianBlue {
    //properties
    String species;
    String name;

    //constructor
    public RussianBlue(String Name){
        species = "Cat";
        name = Name;
    }
    //methods
    public void MakeSound(){
        System.out.println("Hisss");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy(){
        System.out.println("purrrr");
        SeeLaser();
    }
    public void SeeLaser(){
        System.out.println("cat pounces");
    }
}
