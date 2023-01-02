package com.JDBC;


import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws Exception{
    final String url = "jdbc:mysql://localhost:3306/jdbc_test";
    final String userName = "root";
    final String password = "123123";

    String sql = "SELECT * FROM jdbc";
    // 创建数据库连接
    Connection connection = DriverManager.getConnection(url, userName, password);

//  Statement preparedStatement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_SCROLL_INSENSITIVE);
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    ResultSet resultSet = preparedStatement.executeQuery();
    ResultSetMetaData metaData = preparedStatement.getMetaData();
    int columnCount = metaData.getColumnCount();
    Map<String, List<String>> maps = new HashMap<>();

//    for (int i = 1; i <= columnCount; i++) {
      List<String> list = new ArrayList<>();
      while(resultSet.next()) {
        list.add(resultSet.getString(1));
//      }
      maps.put("key", list);
      break;
    }

    System.out.println(maps);
    // ”key“： []

  }
}
