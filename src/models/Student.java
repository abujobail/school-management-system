package models;

public class Student extends Person {
    private double gpa;
    private int attendance;// updated

    public Student(String name, int age, int id, double gpa) {
        super(name, age, id);
        this.gpa = gpa;
        this.attendance = 0;// since student and teacher attendance different purpose and action different
        // because student attendance every day without holiday but teacher give
        // attendance independent day or others day
        // but can not give attendance on holiday as a student
        // so we allocate different attendance ,,if same then we allocate attendance
        // variable in person class
    }

    public double getGpa() {
        return this.gpa;

    }

    public void setGpa(double x) {
        this.gpa = x;
    }

    public int getAttendance() {// updated
        return this.attendance;

    }

    public void attendanceCount() {// updated
        this.attendance++;
    }

    @Override
    public void displayInfo() {// this super.method() call when we are into method ,,without inner method we
                               // can not call super.action
        super.displayInfo();
        System.out.println(" my gpa is " + getGpa());
    }

}