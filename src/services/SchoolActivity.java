package services;

import java.util.ArrayList;

import models.Student;
import models.Teacher;

public class SchoolActivity {

    public void takeStudentsAttendance(int id, SchoolManager school) {
        System.out.println("-----Attendance System----");

        ArrayList<Student> studentList = school.getStudents();// “The getStudentList() method returned a list of
                                                              // students, and the studentList variable pointed to that
                                                              // list.”

        boolean target = false;

        for (Student st : studentList) {// instead of using studentlist ,we could have directly used school.gettudents()
                                        // here
            if (st.getId() == id) {
                st.attendanceCount();
                System.out.println(" " + id + " | " + " " + st.getName() + " | " + st.getAttendance());
                target = true;
                break;
            }

        }
        if (!target) {
            System.out.println("No Student Found this Id");
        }
    }

    public void takeTeachersAttendance(int id, SchoolManager school) {
        System.out.println("-----Attendance System----");

        ArrayList<Teacher> teacherList = school.getTeachers();
        boolean target = false;

        for (Teacher st : teacherList) {
            if (st.getId() == id) {
                st.attendanceCount();
                System.out.println(" " + id + " | " + " " + st.getName() + " | " + st.getAttendance());
                target = true;
                break;
            }

        }
        if (!target) {
            System.out.println("No Teacher Found of this Id");
        }
    }

}
