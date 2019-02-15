package com.company;

/**
 * Created by ap1150 on 2/1/2019.
 */
public class Animal {
    //properties
    String species;
    String name;
    String color;
    int age;

    public Animal(String Species,String Name, String Color ){
    species = Species;
    name = Name;
    color = Color;
    age = 0;
    }
    public void MakeSound(){
        System.out.println("Grrrrr");
    }
    public void SetAge(int newAge){
        age = newAge;
    }
    public void PrintDescription(){
        System.out.println(name +" is a "+age+" year old, "+color+" "+species);
    }
}
