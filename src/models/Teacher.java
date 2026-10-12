package models;

// 'extends Person' নির্দেশ করে Teacher একটি Child Class, যা Person Class-এর বৈশিষ্ট্যসমূহ ইনহেরিট করেছে।
public class Teacher extends Person {

    // Encapsulation: শিক্ষকের নিজস্ব প্রাইভেট ইনস্ট্যান্স ভেরিয়েবল
    private String subject;     // শিক্ষক কোন বিষয়ে পড়ান
    private int attendance;     // শিক্ষকের উপস্থিতি গণনার জন্য

    // কনস্ট্রাক্টর: নাম, বয়স, আইডি এবং বিষয় রিসিভ করে
    public Teacher(String name, int age, int id, String subject) {
        // Parent Class (Person)-এর কনস্ট্রাক্টরকে কল করে name, age, id সেট করা হচ্ছে।
        // নিয়ম অনুযায়ী চাইল্ড কনস্ট্রাক্টরের প্রথম লাইন super() হতে হবে।
        super(name, age, id);
        this.subject = subject;
        this.attendance = 0; // প্রারম্ভিক উপস্থিতি 0 সেট করা হলো
    }

    // Subject পাওয়ার জন্য Getter
    public String getSubject() {
        return this.subject;
    }

    // Subject পরিবর্তন বা আপডেট করার জন্য Setter
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // বর্তমান উপস্থিতি জানার জন্য Getter
    public int getAttendance() {
        return this.attendance;
    }

    // উপস্থিতি ১ বাড়িয়ে দেওয়ার মেথড
    public void attendanceCount() {
        this.attendance++; // attendance = attendance + 1
    }

    // Method Overriding: Parent Class-এর displayInfo() মেথডটি শিক্ষক ক্লাসের জন্য কাস্টমাইজ করা হলো
    @Override
    public void displayInfo() {
        // Person ক্লাসের নাম, বয়স এবং আইডি প্রিন্ট হবে
        super.displayInfo();
        // এরপর শিক্ষকের পঠিত বিষয় প্রিন্ট করবে
        System.out.println(" i teach  " + getSubject());
    }
}