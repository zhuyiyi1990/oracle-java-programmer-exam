package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question29;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Test {

    static Connection newConnection = null;

    private static String driver;

    private static String URL;

    private static String username;

    private static String password;

    static {
        try {
            Properties props = new Properties();
            InputStream in = Test.class.getClassLoader().getResourceAsStream("jdbcConfig.properties");
            props.load(in);
            driver = props.getProperty("jdbc.driver");
            URL = props.getProperty("jdbc.url");
            username = props.getProperty("jdbc.username");
            password = props.getProperty("jdbc.password");
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getDBConnection() throws SQLException {
        try (Connection con = DriverManager.getConnection(URL, username, password)) {
            newConnection = con;
        }
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {
        getDBConnection();
        Statement st = newConnection.createStatement();
        st.executeUpdate("insert into account2 values (4, 'aaa', 1000)");
    }

}
