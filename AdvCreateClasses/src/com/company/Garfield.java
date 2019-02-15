package com.company;

/**
 * Created by ap1150 on 2/5/2019.
 */
public class Garfield {
    //properties
    String species;
    String name;

    //constructor
    public Garfield(){
        species = "Cat";
        name = "Garfield";
    }
    //methods
    public void MakeSound(){
        System.out.println("mmmm, lasagna");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy(){
        LayOnLap();
        System.out.println("takes a nap");
    }
    public void LayOnLap(){
        System.out.println("cuddles on owner's lap");
    }
    public void SeeLaser(){
        BeHappy();
    }
}
