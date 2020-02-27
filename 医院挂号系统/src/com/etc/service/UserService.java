/**
 * 
 */
package com.etc.service;
import java.sql.SQLException;
import com.etc.dao.UserDao;
import com.etc.dao.impl.UserDaoImpl;
import com.etc.pojo.User;
import com.etc.pojo.staticAll;
/**
 * 处理业务逻辑的
 * @author QTH
 *
 */
public class UserService {
	
	// 注入dao
	private static UserDao userDao = new UserDaoImpl();
	
	/**
	 * 登录
	 * @param userName
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	public User login(String userName,String password) throws SQLException{
		return userDao.queryUserByNamePwd(userName, password);
	}
}
