import models.School;
import models.Student;
import models.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        School school = new School();

        File studentsFile = new File("C:\\Users\\Acer\\IdeaProjects\\untitled01\\src\\students.txt");
        Scanner studentsSc = new Scanner(studentsFile);
        while (studentsSc.hasNextLine()) {
            String name = studentsSc.next();
            String surname = studentsSc.next();
            int age = studentsSc.nextInt();
            String genderStr = studentsSc.next();
            boolean gender = genderStr.equals("Female");

            ArrayList<Integer> grades = new ArrayList<>();
            while (studentsSc.hasNextInt()) {
                grades.add(studentsSc.nextInt());
            }

            Student student = new Student(name, surname, age, gender);

            student.addGrades(grades);

            student.calculateGPA();

            school.addMember(student);
        }


        File teachersFile = new File("C:\\Users\\Acer\\IdeaProjects\\untitled01\\src\\teachers.txt");
        Scanner teachersSc = new Scanner(teachersFile);
        while (teachersSc.hasNextLine()) {
            String name = teachersSc.next();
            String surname = teachersSc.next();
            int age = teachersSc.nextInt();
            String genderStr = teachersSc.next();
            boolean gender = genderStr.equals("Female");
            String subject = teachersSc.next();
            int yearsOfExperience = teachersSc.nextInt();
            double salary = teachersSc.nextDouble();

            Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary);

            if(teacher.yearsOfExperience>10){
                teacher.giveRaise(10);
            }
            school.addMember(teacher);
        }

        System.out.println(school);

    }
}