package com.zph.jdbc.apacheDBUtil;

import com.zph.jdbc.entity.City;
import com.zph.jdbc.entity.Emp;
import com.zph.jdbc.util.MySQLDBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DBUtilTest {

    public static Connection connection ;

    public static void testQuery() throws SQLException {
        connection = MySQLDBUtil.getConnection();
        String sql ="select * from city where id=?";
        QueryRunner runner = new QueryRunner();
        City query = runner.query(connection, sql, new BeanHandler<>(City.class), 1901);
        System.out.println(query);
        connection.close();
    }

    public static void testList() throws SQLException {
        connection = MySQLDBUtil.getConnection();
        String sql ="select * from city";
        QueryRunner runner = new QueryRunner();
        List<City> query = runner.query(connection, sql, new BeanListHandler<City>(City.class));
        for (City city : query) {
            System.out.println(city);
        }
        connection.close();
    }


    public static void testArray() throws SQLException {
        connection = MySQLDBUtil.getConnection();
        String sql ="select * from city";
        QueryRunner runner = new QueryRunner();
        Object[] object = runner.query(connection, sql, new ArrayHandler());
        for (Object o : object) {
            System.out.println(o);
        }
        connection.close();
    }

    public static void testArrayList() throws SQLException {
        connection = MySQLDBUtil.getConnection();
        String sql ="select * from city";
        QueryRunner runner = new QueryRunner();
        List<Object[]> query = runner.query(connection, sql, new ArrayListHandler());
        for (Object[] objects : query) {
            System.out.println(objects[0]+" -- "+objects[1]);
        }
        connection.close();
    }

    public static void testMap() throws SQLException {
        connection = MySQLDBUtil.getConnection();
        String sql ="select * from city";
        QueryRunner runner = new QueryRunner();
        Map<String, Object> query = runner.query(connection, sql, new MapHandler());
        Set<Map.Entry<String, Object>> entries = query.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey()+" --- "+entry.getValue());
        }
        connection.close();
    }

    /**
     * 聚合参数的值
     * @throws SQLException
     */
    public static void testSaclarHandler() throws SQLException {
        connection = MySQLDBUtil.getConnection();
        String sql ="select count(*) from city";
        QueryRunner runner = new QueryRunner();
        Object query = runner.query(connection, sql, new ScalarHandler<>());
        System.out.println(query);
        connection.close();
    }

    /**
     * 自定义handler对象
     * @throws SQLException
     */
    public static void testMyHandler() throws SQLException {
        connection = MySQLDBUtil.getConnection();
        String sql ="select * from city where id = ?";
        QueryRunner runner = new QueryRunner();
        City city = runner.query(connection, sql, new ResultSetHandler<City>() {
            @Override
            public City handle(ResultSet resultSet) throws SQLException {
                if(resultSet.next()){
                    City c = new City();
                    c.setId(resultSet.getInt("id"));
                    c.setName(resultSet.getString("name"));
                    return c;
                }
                return null;
            }
        },1901);
        System.out.println(city);
        connection.close();
    }

    public static void insert() throws SQLException {
        String sql = "insert into city(id,name) values(?,?)";
        connection = MySQLDBUtil.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        queryRunner.update(connection,sql,8888,"binzhoushi");
        connection.close();
    }

    public static void update() throws SQLException {
        String sql = "update city set name=? where id = ?";
        connection = MySQLDBUtil.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        queryRunner.update(connection,sql,"binxian",8888);
        connection.close();
    }

    public static void delete() throws SQLException {
        String sql = "delete from city where id=?";
        connection = MySQLDBUtil.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        queryRunner.update(connection,sql,8888);
        connection.close();
    }
    public static void main(String[] args) throws SQLException {
//        testQuery();
//        testList();
//        testArray();
//        testArrayList();
// testMap();
//testSaclarHandler();
//        testMyHandler();
        insert();
//        update();
 //       delete();
    }
}
