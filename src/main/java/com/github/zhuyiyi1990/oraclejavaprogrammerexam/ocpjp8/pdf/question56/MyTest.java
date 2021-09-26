package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question56;

import java.sql.*;

public class MyTest {

    public static void main(String[] args) {
        try {
            String dbURL = "jdbc:mysql://192.1.4.16:3306/zhuyiyi";
            String username = "root";
            String password = "PW99-mys";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            String query = "Select * FROM account2 WHERE ID = 1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                /*System.out.println("ID: " + rs.getInt("Id"));
                System.out.println("Description: " + rs.getString("Descrip"));
                System.out.println("Price: " + rs.getDouble("Price"));
                System.out.println("Quantity: " + rs.getInt("Quantity"));*/
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("name: " + rs.getString("name"));
                System.out.println("money: " + rs.getDouble("money"));
            }
        } catch (SQLException se) {
            System.out.println("Error");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
