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
	
	// ����������д�ڴ˴�  �����Ӳ����  ���Ӳ����  ��Ҫ��һЩ���� д�������ļ���
	private static String url; // ���ݿ�ĵ�ַ 
	// ���ݿ����ӵ��û���
	private static String user;
	// ���ݿ����ӵ�����
	private static String password;
	// ���ݿ�����
    private static String driver;
	// ����һ����  ��ִ��
	static{
		try {
			// �������ʱ ��Ҫ��ȡ�����ļ�
			//File file = new File("./src/mysql.properties");
			 
			//FileInputStream fis = new FileInputStream(file);
			InputStream is = MysqlUtil.class.getResourceAsStream("/mysql.properties");
			// ��ȡproperties �ļ�
			// 1 ���� Properties ����
			Properties properties = new Properties();
			// 2 ���ļ����������ص� Properties ��
			properties.load(is);
			// 3.��ȡ�ļ�����Ϣ
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
	
	// ͨ�õĻ�ȡ���Ӷ���ķ���
	public static Connection getConnection() throws SQLException{
		// ��ȡ����
		Connection connection =  DriverManager.getConnection(url, user, password);
		return connection;
	}
	
	/**
	 * �ر���Դ
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
