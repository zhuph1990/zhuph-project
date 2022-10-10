package com.zph.jdbc.dao.impl;

import com.zph.jdbc.util.OracleDBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDaoImpl {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        insertBatch();
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("------------");
        long start2 = System.currentTimeMillis();
        for (int i = 1001; i < 2000; i++) {
            insertBatch2(i, "messi" + i);
        }
        System.out.println(System.currentTimeMillis() - start2);
    }

    public static void insertBatch() {
        Connection connection = OracleDBUtil.getConnection();
        PreparedStatement pstmt = null;
        String sql = "insert into emp(empno,ename) values (?,?)";
        //准备预处理快对象
        try {
            pstmt = connection.prepareStatement(sql);
            for (int i = 0; i < 1000; i++) {
                pstmt.setInt(1, i);
                pstmt.setString(2, "messi" + i);
                //向批处理中添加sql语句
                pstmt.addBatch();
            }
            int[] ints = pstmt.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            OracleDBUtil.closeConnection(connection, pstmt);
        }
    }

    public static void insertBatch2(int i, String name) {
        Connection connection = OracleDBUtil.getConnection();
        PreparedStatement pstmt = null;
        String sql = "insert into emp(empno,ename) values (?,?)";
        //准备预处理快对象
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, i);
            pstmt.setString(2, name);
            //向批处理中添加sql语句
            int j = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            OracleDBUtil.closeConnection(connection, pstmt);
        }
    }
}
