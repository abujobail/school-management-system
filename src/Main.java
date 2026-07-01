import java.util.Scanner;

import models.Student;
import models.Teacher;
import services.SchoolActivity;
import services.SchoolManager;

public class Main {
    public static void main(String[] args) {

        SchoolManager school = new SchoolManager();
        SchoolActivity activity = new SchoolActivity();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n======SCHOOL MANAGEMENT SYSTEM =======");
            System.out.println("1 : -- Add Student ---");
            System.out.println("2 : --- Add Teacher ---");
            System.out.println("3 : --- View All Students ---");
            System.out.println("4 : ---View All Teachers ---");
            System.out.println("5 : --- Search Student By Id ---");
            System.out.println("6 : --- Search Teacher Subject ---");
            System.out.println("7 : --- Update Student GPA --- ");
            System.out.println("8 : --- Delete Student ---");
            System.out.println("9 : --- Delete Teacher ---");
            System.out.println("10 : --- Taking Attendance ---");// updated
            System.out.println("11 : --- Taking Teacher Attendance ---");// updated
            System.out.println("12 : --- EXIT ---");

            System.out.println(" Enter Your Choice ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println(" Add student portal ");

                    System.out.println(" Enter Student  Name ");
                    String sName = sc.nextLine();

                    System.out.println(" Enter Student Age ");
                    int sAge = sc.nextInt();

                    System.out.println(" Enter Student Id ");
                    int sId = sc.nextInt();

                    System.out.println(" Enter Student GPA ");
                    double sGPA = sc.nextDouble();

                    Student st = new Student(sName, sAge, sId, sGPA);

                    school.addStudent(st);
                    break;
                }

                case 2: {
                    System.out.println(" Add Teacher  portal ");

                    System.out.println(" Enter Teacher  Name ");
                    String tName = sc.nextLine();

                    System.out.println(" Enter Teacher Age ");
                    int tAge = sc.nextInt();

                    System.out.println(" Enter Teacher Id ");
                    int tId = sc.nextInt();
                    sc.nextLine();// update because when i am typing int then remain buffer ,,then i set up this
                                  // line

                    System.out.println(" Enter Teacher Subject ");
                    String tSubject = sc.nextLine();
                    Teacher tc = new Teacher(tName, tAge, tId, tSubject);
                    school.addTeacher(tc);
                    break;
                }
                case 3: {
                    school.viewAllStudents();
                    break;
                }
                case 4: {
                    school.viewAllTeachers();
                    break;
                }
                case 5: {
                    System.out.print("Enter Student ID to search: ");
                    int searchSId = sc.nextInt();
                    school.searchStudentById(searchSId);
                    break; // updated
                }
                case 6: {
                    System.out.print("Enter Teacher ID to find subject: ");
                    int searchTId = sc.nextInt();
                    school.searchTeacherSubjectById(searchTId);
                    break;
                }
                case 7: {
                    System.out.print("Enter Student ID to update GPA: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter New GPA: ");
                    double newGpa = sc.nextDouble();
                    school.updateStudentGpa(updateId, newGpa);
                    break;
                }
                case 8: {
                    System.out.print("Enter Student ID to delete: ");
                    int delSId = sc.nextInt();
                    school.deleteStudentById(delSId);
                    break;
                }
                case 9: {
                    System.out.print("Enter Teacher ID to delete: ");
                    int delTId = sc.nextInt();
                    school.deleteTeacherById(delTId);
                    break;
                }
                case 10: {
                    System.out.println("\n--- Taking Student Attendance ---");

                    System.out.print("Enter Student ID: ");
                    int attSId = sc.nextInt();
                    sc.nextLine();

                    activity.takeStudentsAttendance(attSId, school);
                    break;
                }
                case 11: {
                    System.out.println("\n--- Taking Teacher Attendance ---");

                    System.out.print("Enter Teacher ID: ");
                    int attTId = sc.nextInt();
                    sc.nextLine();

                    activity.takeTeachersAttendance(attTId, school);
                    break;
                }
                case 12: {
                    System.out.println(" Existing System ....GoodBye");
                    sc.close();
                    System.exit(0);
                    break;
                }

                default:
                    System.out.println("Invalid choice ! Pls Enter a number between 1 and  12  ");
                    break;
            }

        }
    }
}