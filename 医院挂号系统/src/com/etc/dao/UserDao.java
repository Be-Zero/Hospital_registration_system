/**
 * 
 */
package com.etc.dao;
import java.sql.SQLException;
import com.etc.pojo.User;
/**
 * 连接数据库资源的
 * @author QTH
 *
 */
public interface UserDao {
	
	/**
	 * 根据用户名和密码 查询用户
	 * @param userName
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	public abstract User queryUserByNamePwd(String userName,String password)  throws SQLException;
}
