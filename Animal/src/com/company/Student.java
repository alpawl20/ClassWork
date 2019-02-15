package com.company;

import javax.naming.Name;

/**
 * Created by ap1150 on 2/4/2019.
 */
public class Student {
    //properties
    int studentID;
    String name;
    double contentGrade;
    double workHabitGrade;
    double participation;
    int age;

    //constructor
    public Student (String Name, int ID, int Age){
        name = Name;
        studentID = ID;
        age = Age;
    }

    //constructor
    public Student(){
        name = "Test Student";
        studentID = -1;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
        age = 18;
    }
    //methods
    public void SetContentGrade(int grade){
        contentGrade = grade;
    }
    public void SetWorkHabitGrade(int grade){
        workHabitGrade = grade;
    }
    public void SetParticpitation(int grade){
        participation = grade;
    }
    public double GetGrade(){
        return (.35*workHabitGrade+.4*contentGrade+.25*participation);
    }
    public void printGrade(){
        System.out.println(GetGrade());
    }
}
