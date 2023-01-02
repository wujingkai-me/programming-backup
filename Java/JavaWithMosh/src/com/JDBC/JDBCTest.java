package com.JDBC;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTest {
  /*
  * @param: DATABASE NAME jdbc_test
  * @param: password      123123
  * */
  public static void connection() throws SQLException {
    Driver driver = new com.mysql.cj.jdbc.Driver();  // 创建一个Mysql驱动 MySQL 8.0.27

    String url = "jdbc:mysql://localhost:3306/jdbc_test";  // 地址名称
    Properties info = new Properties();  // connect 需要一个Properties对象

    info.setProperty("user", "root");
    info.setProperty("password", "123123");

    Connection connection = driver.connect(url, info); // 创建一个 连接 对象

    System.out.println(connection);

  }

  public static void connectionOther() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
    Class packageName = Class.forName("com.mysql.cj.jdbc.Driver");
    Driver driver = (Driver) packageName.newInstance();

    String url = "jdbc:mysql://localhost:3306/jdbc_test";  // 地址名称

    Properties info = new Properties();  // connect 需要一个Properties对象

    info.setProperty("user", "root");
    info.setProperty("password", "123123");

    Connection connection = driver.connect(url, info); // 创建一个 连接 对象
    System.out.println(connection);
  }

  public static void connectionDriverManager() throws Exception {
    final String url = "jdbc:mysql://localhost:3306/jdbc_test";
    final String user = "root";
    final String password = "123123";

    Class packageName = Class.forName("com.mysql.cj.jdbc.Driver");
    Driver driver = (Driver) packageName.newInstance();
    DriverManager.registerDriver(driver);
    Connection connection = DriverManager.getConnection(url, user, password);

    System.out.println(connection);
  }

  public static void connectionDriverManagerOther() throws Exception {
    final String url = "jdbc:mysql://localhost:3306/jdbc_test";
    final String user = "root";
    final String password = "123123";

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, user, password);

    System.out.println(connection);

  }

  public void connection1() throws Exception {
    InputStream resourceAsStream = JDBCTest.class.getClassLoader().getResourceAsStream("jdbc.properties");

    Properties properties = new Properties();
    properties.load(resourceAsStream);

    String user = properties.getProperty("user");
    String password = properties.getProperty("password");
    String url = properties.getProperty("url");
    String driverClass = properties.getProperty("className");

    Class.forName(driverClass);

    Connection connection = DriverManager.getConnection(url, user, password);

    System.out.println(connection);
  }

  public PreparedStatement SQLStatement() {
    return new PreparedStatement();
  }

  public class PreparedStatement {
    final String url = "jdbc:mysql://localhost:3306/jdbc_test";
    final String user = "root";
    final String password = "123123";
    Connection connection;
    PreparedStatement() {

      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection(this.url, this.user, this.password);
      } catch (ClassNotFoundException | SQLException e) {
        this.connection = null;
        e.printStackTrace();
      } finally {
        System.out.println("connection is successfully");
      }
    }

    public void executeSQLStatement(String sql) throws SQLException, ClassNotFoundException {


      java.sql.PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

//      preparedStatement.setString(1, "value");
      preparedStatement.execute();
      preparedStatement.close();

//      this.connection.close();

      System.out.println("执行成功！！");

    }

    public ResultSet SQLQuery(String sql) throws SQLException {
      ResultSet resultSet = this.connection.prepareStatement(sql).executeQuery();
//      this.connection.close();
      return resultSet;
    }

  }
}
