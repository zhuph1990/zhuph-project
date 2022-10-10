package com.zph.jdbc.pool.HikariCP;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class HikariCPTest {
    public static void main(String[] args) throws SQLException {

//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:mysql://localhost:3306/world?serverTimezone=UTC");
//        config.setUsername("root");
//        config.setPassword("root");
//        HikariDataSource ds = new HikariDataSource(config);
//        Connection connection = ds.getConnection();
//        System.out.println(connection);
//        connection.close();


//        HikariDataSource hikariDataSource = new HikariDataSource();
//        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/world?serverTimezone=UTC");
//        hikariDataSource.setUsername("root");
//        hikariDataSource.setPassword("root");
//        Connection connection = hikariDataSource.getConnection();
//        System.out.println(connection);
//        connection.close();

        HikariConfig config = new HikariConfig("src/com/zph/jdbc/pool/HikariCP/HikariCP.properties");
        HikariDataSource dataSource = new HikariDataSource(config);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
