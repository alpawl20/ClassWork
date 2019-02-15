package com.company;

/**
 * Created by ap1150 on 2/1/2019.
 */
public class Car {
    //properties
    String make;
    String model;
    double milesTraveled;
    double mpg;
    double TankSize;
    double GallonsOfGas;

    //constructor
    public Car(){
        make = "Ford";
        model = "Escape";
        milesTraveled = 0;
        mpg = 24;
        TankSize = 12;
        GallonsOfGas = TankSize;

    }
    public Car(String Make,String Model, double MPG, double tanksize){
        make = Make;
        model = Model;
        mpg = MPG;
        TankSize = tanksize;
    }
    //methods
    public void DriveTillEmpty (){
        milesTraveled = milesTraveled + mpg*GallonsOfGas;
        GallonsOfGas = 0;
    }
    public void FillUpTheTank(){
        GallonsOfGas = TankSize;
    }
    public void DriveXMiles(double miles){

       if (GallonsOfGas>miles/mpg){
           milesTraveled = milesTraveled+miles;
           GallonsOfGas = GallonsOfGas - miles/mpg;
       }

          else{
           DriveTillEmpty();

           }
    }
}
