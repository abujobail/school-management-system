package models;


public class Student extends Person {
    private double gpa;

    public Student(String name, int age, int id, double gpa) {
        super(name, age, id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;

    }

    public void setGpa(double x) {
        this.gpa = x;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" my gpa is " + getGpa());
    }

  

}