package models;

public class Teacher extends Person {
    private String subject;
    public int yearsOfExperience;
    private double salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, double salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;

    }
    public void giveRaise(int percent) {
        salary += salary * percent / 100;
        System.out.println(this.name + " has a raise: " + salary);
    }
    @Override
    public String toString() {
        return super.toString() + "I teach " + subject + ".";
    }
}
