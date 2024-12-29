package models;

import java.util.ArrayList;
import java.util.Random;

public class Student extends Person {
    private int studentID;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = new Random().nextInt(9000) + 1000;
        this.grades = new ArrayList<>();
    }

    public void addGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void calculateGPA(){
        double sum=0;
        for(Integer grade:grades){
            sum+=grade;
        }
        System.out.println("GPA of a student " + this.name + " " + this.surname + ": " +  (sum/grades.size())/25);
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }

}