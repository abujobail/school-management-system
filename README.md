# 🏫 School Management System

A simple console-based application built with Java.
It manages records for students and teachers.

---

## 🧠 System Architecture

The project is split into three simple layers:

1. **`Main.java` (UI Layer)**
   - Displays the menu.
   - Takes inputs from the user using `Scanner`.
   - Does not store any data.

2. **`SchoolManager.java` (Database Layer)**
   - Holds the main `ArrayList` data.
   - Initializes collections inside the constructor.
   - Stores object references inside the Heap Memory.

3. **`SchoolActivity.java` (Service Layer)**
   - Completely lightweight.
   - Fetches the array list via getters.
   - Updates features like attendance directly on the objects.

---

## 🛠️ OOP Features Implemented

* **Inheritance:** `Student` and `Teacher` inherit from a base `Person` class.
* **Encapsulation:** Uses `private` fields with `Getter` and `Setter` methods.
* **Decoupling:** UI layer and data logic are completely separated.

---

## 🚀 Features

- [x] Add Students & Teachers dynamically.
- [x] Search student and teacher records by ID.
- [x] Delete records safely from memory.
- [x] Track live attendance counts.
- [x] Scanner input buffer fix included.

---

## 💻 How to Run

1. Clone the repo:
```bash
git clone [https://github.com/abujobail/school-management-system.git](https://github.com/abujobail/school-management-system.git)