package com.company;

/**
 * Created by ap1150 on 2/5/2019.
 */
public class Dog {
    //properties
    String species;
    String name;
    boolean dockedTail;

    //constructor
    public Dog (String Name, boolean DockedTail){
        species = "Dog";
        name = Name;
        dockedTail = DockedTail;
    }
    //methods
    public void MakeSound(){
        System.out.println("Woof");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void PlayFetch(){
        System.out.println("chases ball 5 times then quits");
    }
    public boolean getDockedTail(){
        return dockedTail;
    }

}
