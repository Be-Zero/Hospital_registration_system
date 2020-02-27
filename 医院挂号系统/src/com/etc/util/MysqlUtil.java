/**
 * 
 */
package com.etc.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/**
 * @author Administrator
 *
 */
public class MysqlUtil {
	
	// 将连接条件写在此处  会出现硬编码  解决硬编码  需要将一些配置 写在配置文件中
	private static String url; // 数据库的地址 
	// 数据库连接的用户名
	private static String user;
	// 数据库连接的密码
	private static String password;
	// 数据库驱动
    private static String driver;
	// 程序一加载  就执行
	static{
		try {
			// 程序加载时 就要读取配置文件
			//File file = new File("./src/mysql.properties");
			 
			//FileInputStream fis = new FileInputStream(file);
			InputStream is = MysqlUtil.class.getResourceAsStream("/mysql.properties");
			// 读取properties 文件
			// 1 创建 Properties 对象
			Properties properties = new Properties();
			// 2 将文件读入流加载到 Properties 中
			properties.load(is);
			// 3.读取文件的信息
			url = properties.getProperty("jdbc.url");
			user =  properties.getProperty("jdbc.user");
			password =  properties.getProperty("jdbc.password");
			driver =   properties.getProperty("jdbc.driver");
			Class.forName(driver);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 通用的获取连接对象的方法
	public static Connection getConnection() throws SQLException{
		// 获取连接
		Connection connection =  DriverManager.getConnection(url, user, password);
		return connection;
	}
	
	/**
	 * 关闭资源
	 * @param connection
	 * @param statement
	 * @param resultSet
	 * @throws SQLException
	 */
	public static void close(Connection connection,Statement statement,ResultSet resultSet) throws SQLException{
		if(resultSet != null){
			resultSet.close();
		}
		if(statement != null){
		    statement.close();
		}
	
		if(connection != null){
			connection.close();
		}
	}

	public static void close(Connection connection,PreparedStatement statement,ResultSet resultSet) throws SQLException{
		
		if(resultSet != null){
			resultSet.close();
		}
		if(statement != null){
		    statement.close();
		}
	
		if(connection != null){
			connection.close();
		}
	}
	
public static void close(Connection connection,CallableStatement statement,ResultSet resultSet) throws SQLException{
		
		if(resultSet != null){
			resultSet.close();
		}
		if(statement != null){
		    statement.close();
		}
		if(connection != null){
			connection.close();
		}
	}
}
