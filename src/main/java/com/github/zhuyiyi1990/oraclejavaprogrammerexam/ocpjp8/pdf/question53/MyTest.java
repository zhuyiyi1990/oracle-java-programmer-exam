package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question53;

import java.sql.*;

public class MyTest {

    public static void main(String[] args) throws Exception {
        String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
        String userName = "dell";
        String passWord = "password";
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection(dbURL, userName, passWord);
        String query = "SELECT id FROM S_CUSTOMER";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            stmt.executeQuery("SELECT id FROM S_DEPT");
            while (rs.next()) {
                //process the results
                System.out.println("Employee ID: " + rs.getInt("id"));
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
