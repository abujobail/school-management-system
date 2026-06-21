package services;

import java.util.ArrayList;

import models.Student;
import models.Teacher;

public class SchoolManager {

    private ArrayList<Student> st;
    private ArrayList<Teacher> tc;

    public SchoolManager() {
        this.st = new ArrayList<>();
        this.tc = new ArrayList<>();
    }

    public void addStudent(Student student) {
        st.add(student);
        System.out.println("student added successfully\n");
    }

    public void addTeacher(Teacher teacher) {
        tc.add(teacher);
        System.out.println("Teacher added successfully\n");
    }

    public void viewAllStudents() {
        if (st.isEmpty()) {
            System.out.println("No students registered yet!\n");
        } else {
            System.out.println("--- Student List ---\n");
            for (Student x : st) {
                x.displayInfo();
                System.out.println("--------------------\n");
            }
        }
    }

    public void viewAllTeachers() {
        if (tc.isEmpty()) {
            System.out.println("No teachers registered yet!\n");
        } else {
            System.out.println("--- Teacher  List ---\n");
            for (Teacher y : tc) {
                y.displayInfo();
                System.out.println("--------------------\n");
            }
        }
    }

    public void searchStudentById(int id) {
        if (st.isEmpty()) {
            System.out.println("no student registered yet!\n");
        } else {
            System.out.println("-----student list-------\n");
            for (Student s : st) {
                if (s.getId() == id) {
                    s.displayInfo();
                    return;
                }
            }
            System.out.println("Student with ID " + id + " not found!\n");
        }
    }

    public void searchTeacherSubjectById(int id) {
        for (Teacher x : tc) {
            if (x.getId() == id) {
                System.out.println(x.getName() + " teaches " + x.getSubject());
                return;
            }
        }
        System.out.println("Teacher with ID " + id + " not found!\n");
    }

    public void updateStudentGpa(int id, double newGpa) {
        for (Student x : st) {
            if (id == x.getId()) {
                x.setGpa(newGpa);
                System.out.println("gpa updated succesfully\n");
                return;
            }
        }

    }

    public void deleteStudentById(int id) {
        for (Student x : st) {
            if (id == x.getId()) {
                st.remove(x);
                System.out.println("Student deleted successfully \n");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!\n");
    }

    public void deleteTeacherById(int id) {
        for (Teacher x : tc) {
            if (id == x.getId()) {
                tc.remove(x);
                System.out.println("Teacher deleted successfully\n");
                return;
            }
        }
        System.out.println("Teacher with ID " + id + " not found!\n");
    }
}
