package dao;

import config.DatabaseUtil;
import models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
public  boolean saveStudentsBatch(List<Student> students){

    try

    {
        connection = DatabaseUtil.getConnection();

        String sql = "INSERT INTO students (id,name,age) VALUES (?,?,?)";
        preparedStatement = connection.prepareStatement(sql);

        for(Student student:students) {

            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.addBatch();

        }
        int[] result = preparedStatement.executeBatch();
        return result.length>0;


    }
    catch(SQLException e)

    {

        e.printStackTrace();
        return  false;
    }
    finally {
        try {
           DatabaseUtil.closeConnection(connection, preparedStatement);
        } catch (SQLException ex) {}
    }
}

// retrieve data from database
public List<Student>getAllStudent(){

    List<Student> studentList=new ArrayList<Student>();
     try{
         connection =DatabaseUtil.getConnection();
         preparedStatement = connection.prepareStatement("SELECT * FROM students");

         resultSet= preparedStatement.executeQuery();
         while (resultSet.next()) {
             int id=resultSet.getInt(1);
             String name=resultSet.getString(2);
             int age=resultSet.getInt(3);
             double gpa=resultSet.getDouble(4);
             Student student=new Student(name,age,id,gpa);
             studentList.add(student);
         }
     } catch (SQLException e) {
        e.printStackTrace();
     }
     finally {
         try {
             if(resultSet!=null){
                 resultSet.close();
             }
             DatabaseUtil.closeConnection(connection, preparedStatement);
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
     }
     return  studentList;
}
//retrive data of one person
    public Student getStudentById(int searchId) throws SQLException {

    try {
        connection = DatabaseUtil.getConnection();
        preparedStatement = connection.prepareStatement("SELECT * FROM students WHERE id=?");

        preparedStatement.setInt(1, searchId);
        resultSet=preparedStatement.executeQuery();


                if(resultSet.next()) {
                    int sid=resultSet.getInt(1);
String name=resultSet.getString(2);
int age=resultSet.getInt(3);
double gpa=resultSet.getDouble(5);
                    Student student=new Student(name,age,sid,gpa);
                    return  student;

                }


    } catch (SQLException e) {
        e.printStackTrace();
    }
    finally {
        try {
            if(resultSet!=null){
                resultSet.close();
            }

                DatabaseUtil.closeConnection(connection, preparedStatement);

        } catch (SQLException e) {
         e.printStackTrace();
        }
    }


        return null;
    }


}


