package models;

// 'extends Person' দিয়ে বোঝানো হচ্ছে Student একটি Child Class, যা Person Parent Class কে Inherit করেছে।
public class Student extends Person {
    // Student-এর নিজস্ব প্রাইভেট ফিল্ড (Encapsulation)
    private double gpa;
    private int attendance; // স্টুডেন্টের উপস্থিতি গণনার জন্য

    // কনস্ট্রাক্টর: প্যারেন্ট ক্লাসের ডাটা (name, age, id) এবং নিজস্ব ডাটা (gpa) রিসিভ করে
    public Student(String name, int age, int id, double gpa) {
        // super(...) দিয়ে Parent Class (Person)-এর কনস্ট্রাক্টরকে কল করা হচ্ছে।
        // এটি অবশ্যই কনস্ট্রাক্টরের প্রথম লাইনে থাকতে হবে।
        super(name, age, id);
        this.gpa = gpa;
        this.attendance = 0; // প্রারম্ভিক উপস্থিতি সবসময় 0 দিয়ে সেট করা হচ্ছে
    }

    // GPA পাওয়ার জন্য Getter
    public double getGpa() {
        return this.gpa;
    }

    // GPA আপডেট করার জন্য Setter
    public void setGpa(double x) {
        this.gpa = x;
    }

    // বর্তমান উপস্থিতি জানার জন্য Getter
    public int getAttendance() {
        return this.attendance;
    }

    // উপস্থিতি ১ বাড়িয়ে দেওয়ার মেথড
    public void attendanceCount() {
        this.attendance++; // attendance = attendance + 1
    }

    // Method Overriding: Parent Class-এর displayInfo() মেথডকে পুনরায় নতুনভাবে সাজানো হচ্ছে
    @Override
    public void displayInfo() {
        // super.displayInfo() দিলে Person ক্লাসের নাম, বয়স এবং আইডি প্রিন্ট হবে
        super.displayInfo();
        // এরপর স্টুডেন্টের নিজস্ব GPA প্রিন্ট করবে
        System.out.println(" my gpa is " + getGpa());
    }
}