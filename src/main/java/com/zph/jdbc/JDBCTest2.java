package com.zph.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//如果需要建议连接，java中提供了一套标准，数据库厂商来进行实现，包含实现子类，实子类的jar文件在哪？
//一般情况下存放在安装目录下
public class JDBCTest2 {

    public static final String URL = "jdbc:mysql://localhost:3306/world?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {


        //1、加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection =
                DriverManager.getConnection(URL, USERNAME, PASSWORD);
        //3、测试连接是否成功
        System.out.println(connection);
        //4、定义sql语句

    }
}
