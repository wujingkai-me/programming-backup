package com.JDBC;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class baseDAO {
  private final String user = "root";
  private final String password = "123123";
  private final String JDBCUrl = "jdbc:mysql://localhost:3306/jdbc_test";
  private Connection connection = null;

  baseDAO() {
    try {
      this.connection = DriverManager.getConnection(this.JDBCUrl, this.user, this.password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public Map<String, List<String>> queryMysql(String sql) {
    try {
      Statement statement = this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
              ResultSet.TYPE_SCROLL_SENSITIVE);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    

    return null;
  }

}