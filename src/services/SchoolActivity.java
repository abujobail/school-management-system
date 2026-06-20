package services;

import models.Person;

public class SchoolActivity{
    public void attendance(Person person){
System.out.println("-----Attendance System----");
person.displayInfo();
System.out.println("status: person in school today\n");
    }
}