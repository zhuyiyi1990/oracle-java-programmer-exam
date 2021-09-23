package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question106;

class DBConfiguration {

    String user;

    String password;

}

public class DBHandler {

    DBConfiguration configureDB(String uname, String password) {
//        test A
        DBConfiguration f = null;
        return f;
    }

    public static void main(String[] args) {
        DBHandler r = new DBHandler();
        DBConfiguration dbConf = r.configureDB("manager", "manager");
    }

}
