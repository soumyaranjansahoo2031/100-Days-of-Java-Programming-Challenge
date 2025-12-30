package org.example;

import java.sql.*;

public class JDBCdemo {
    private static final String URL = "jdbc:mysql://localhost:3306/demo_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root#1234";

//    public static void main(String[] args){
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(URL,USER,PASSWORD);
//            System.out.println("connected to the database");
//        } catch (SQLException e) {
//            e.printStackTrace();

    /// /            throw new RuntimeException(e);
//        }finally{
//            try {
//                conn.close();
//                System.out.println("connection closed");
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        }
//}
    //-------------------
    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);) {
            System.out.println("Connected to the database");
//            insertStudent(conn,"Charlie","charlie@gmail.com");
            updateStudent(conn, 2, "Bob", "alice@gmail.com");
            selectStudents(conn);
            deleteStudent(conn,2);
            selectStudents(conn);
//            System.out.println("data added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            //            throw new RuntimeException(e);
        }

    }
    private static void insertStudent(Connection conn,String name,String email){
        String sql = "INSERT INTO students (name,email) VALUES ('"+name+"','"+email+"')";
        try(Statement stmt =  conn.createStatement()){
            int rows = stmt.executeUpdate(sql);
            System.out.println("Inserted: "+rows);
        } catch (SQLException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }
    private static void selectStudents(Connection conn){
        String sql = "SELECT * FROM students";
        try(Statement stmt =  conn.createStatement()){
            ResultSet resultSet = stmt.executeQuery(sql);
            System.out.println(resultSet);
            System.out.println("students list");
            while(resultSet.next()){
               int id = resultSet.getInt("id");
               String name = resultSet.getString(("name"));
               String email = resultSet.getString("email");
                System.out.println(id+" : "+name+" : "+email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }
    private static void updateStudent(Connection conn, int id, String name, String email) {
//        String sql = "UPDATE students SET name = '" + name + "', email = '" + email + "' WHERE id=" + id;
        String sql = "UPDATE students SET name = ?, email = ? WHERE id = ?";
//       UPDATE student SET name = 'Alice', email = 'email@gmail.com'
//       WHERE id = 10;
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setInt(3, id);
            int rows = pstmt.executeUpdate();
            System.out.println("UPDATED: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteStudent(Connection conn, int id) {
        String sql = "DELETE FROM students WHERE id = " + id;
        try (Statement stmt = conn.createStatement()) {
            int rows = stmt.executeUpdate(sql);
            System.out.println("DELETED: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
