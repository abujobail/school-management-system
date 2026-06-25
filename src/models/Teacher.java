package models;

public class Teacher extends Person {
    private String subject;
    private int attendance;

    public Teacher(String name, int age, int id, String subject) {
        super(name, age, id);
        this.subject = subject;
        this.attendance = 0;

    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAttendance() {
        return this.attendance;
    }

    public void attendanceCount() {
        this.attendance++;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" i teach  " + getSubject());
    }

}