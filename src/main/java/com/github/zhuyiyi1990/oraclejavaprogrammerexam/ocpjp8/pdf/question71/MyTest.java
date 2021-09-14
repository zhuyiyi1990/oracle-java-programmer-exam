package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question71;

import java.sql.*;

public class MyTest {

    private static String driver = "com.mysql.cj.jdbc.Driver";

    private static String URL = "jdbc:mysql://192.1.4.16:3306/zhuyiyi";

    private static String userName = "root";

    private static String passWord = "PW99-mys";

    public static void main(String[] args) {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(URL, userName, passWord);
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            st.execute("SELECT * FROM account2");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                if (rs.getInt(1) == 2) {
                    rs.updateString(2, "Jack");
//                    rs.updateRow();
                    System.out.println("updated");
                }
            }
            rs.absolute(2);
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
            rs.updateRow();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Exception is raised");
        }
    }

}
