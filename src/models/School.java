package models;

import models.Person;

import java.util.ArrayList;

public class School {
    private ArrayList<Person> members;
    public School() {
        members = new ArrayList<>();
    }
    public void addMember(Person person) {
        members.add(person);
    }
    @Override

    public String toString() {
        String membersString = "";
        for (Person member : members) {
            membersString += member.toString() + "\n";
        }
        return membersString;
    }

}