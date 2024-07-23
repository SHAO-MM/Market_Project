package org.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author SHAO
 * @date 2024/7/23 下午10:10
 */
public class DBUtil {
    // 将上一个类封装
    private static final String URL ="jdbc:mysql://localhost:3306/nuist?characterEncoding=utf-8";
    private static final String USERNAME ="root";
    private static final String PASSWORD ="a12345";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}