package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car BakerCar = new Car();

        System.out.println(BakerCar.model);
        Car PeteCar = new Car("Ford","Mustang",10,15);
        System.out.println(PeteCar.model);
        System.out.println(BakerCar);
        PeteCar.DriveTillEmpty();
        System.out.println(PeteCar.milesTraveled);
        PeteCar.FillUpTheTank();
        PeteCar.DriveXMiles(120);
        System.out.println(PeteCar.milesTraveled);
        PeteCar.DriveXMiles(120);
        System.out.println(PeteCar.milesTraveled);

    }
}
