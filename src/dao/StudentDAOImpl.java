package dao;

import config.DatabaseUtil;
import models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentDAOImpl {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
public  boolean saveStudentsBatch(List<Student> students){

    try

    {
        connection = DatabaseUtil.getConnection();


        String sql = "INSERT INTO students (id,name,age) VALUES (?,?,?)";
        for(Student student:students) {
            preparedStatement = connection.prepareStatement(sql);
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


}


