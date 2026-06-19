package models;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, int id, String subject) {
        super(name, age, id);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String sub) {
        this.subject = sub;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" i teach  " + getSubject());
    }

}