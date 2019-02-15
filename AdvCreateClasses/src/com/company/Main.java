package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // The problem was asking me to create classes for each stated, then put all into the main.



        //creating the object
        Animal newAnimal = new Animal("dog","Buddy");
        //What the object is going to do/ methods
        newAnimal.MakeSound();
        newAnimal.PrintName();

        //creating the object
        Dog newDog = new Dog("Baxter" ,true);
        //What the object is going to do/ methods
        newDog.MakeSound();
        newDog.PrintName();
        newDog.PlayFetch();
        newDog.getDockedTail();

        //creating the object
        Cat newCat = new Cat("Cat");
        //What the object is going to do/ methods
        newCat.MakeSound();
        newCat.PrintName();
        newCat.BeHappy();
        newCat.SeeLaser();

        //creating the object
        OrangeTabby newOT = new OrangeTabby("OT");
        //What the object is going to do/ methods
        newOT.MakeSound();
        newOT.PrintName();
        newOT.BeHappy();
        newOT.LayOnLap();
        newOT.SeeLaser();

        //creating the object
        RussianBlue newRB = new RussianBlue("RB");
        //What the object is going to do/ methods
        newRB.MakeSound();
        newRB.PrintName();
        newRB.BeHappy();
        newRB.SeeLaser();

        //creating the object
        Garfield newGar = new Garfield();
        //What the object is going to do/ methods
        newGar.MakeSound();
        newGar.PrintName();
        newGar.BeHappy();
        newGar.LayOnLap();
        newGar.SeeLaser();

    }
}
