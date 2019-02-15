package com.company;

/**
 * Created by ap1150 on 2/5/2019.
 */
public class Animal {
    //properties
    String species;
    String name;

    //constructor
    public Animal(String Species, String Name){
        name = Name;
        species = Species;
    }
    //methods
    public void MakeSound(){
        System.out.println("Grrr");
    }
    public  void PrintName(){
        System.out.println(name);
    }
}
