package models;

// abstract নির্দেশ করে যে এই ক্লাসের সরাসরি কোনো Object (new Person()) তৈরি করা যাবে না।
// এটি কেবল চাইল্ড ক্লাস (Student, Teacher) ইত্যাদির জন্য Parent/Base Class হিসেবে কাজ করবে।
public abstract class Person {

    // Encapsulation: প্রাইভেট ইনস্ট্যান্স ভেরিয়েবল। বাইরের ক্লাস থেকে সরাসরি পরিবর্তনযোগ্য নয়।
    private String name;
    private int age;
    private int id;

    // কনস্ট্রাক্টর: নতুন অবজেক্ট তৈরির সময় নাম, বয়স এবং আইডি সেট করে।
    public Person(String name, int age, int id) {
        this.name = name; // 'this.name' হলো হিফ মেমোরির ফিল্ড, আর 'name' হলো প্যারামিটার।
        this.age = age;
        this.id = id;
    }

    // Getter Method: নাম জানার জন্য
    public String getName() {
        return name;
    }

    // Getter Method: আইডি জানার জন্য
    public int getId() {
        return id;
    }

    // Getter Method: বয়স জানার জন্য
    public int getAge() {
        return age;
    }

    // Setter Method: প্রয়োজন হলে নাম পরিবর্তন করার জন্য
    public void setName(String name) {
        this.name = name;
    }

    // Setter Method: প্রয়োজন হলে বয়স পরিবর্তন করার জন্য
    public void setAge(int age) {
        this.age = age;
    }

    // Setter Method: প্রয়োজন হলে আইডি পরিবর্তন করার জন্য
    public void setId(int id) {
        this.id = id;
    }

    // কনসোলে সাধারণ তথ্যাবলী প্রিন্ট করার মেথড।
    // চাইল্ড ক্লাসগুলো এই মেথডটিকে Overrides করবে।
    public void displayInfo() {
        System.out.println("my name is " + getName() + " " + " my age " + getAge() + " " + " my id " + getId());
    }
}