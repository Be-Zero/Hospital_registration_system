/**
 * 
 */
package com.etc.dao.impl;
import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import com.etc.pojo.staticAll;
import com.etc.dao.UserDao;
import com.etc.pojo.User;
import com.etc.util.MysqlUtil;
/**
 * 登录
 * @author QTH
 *
 */
public class UserDaoImpl implements UserDao{
    
	/**
	 * 通过用户名和密码 查询用户
	 */
	@Override
	public User queryUserByNamePwd(String userName, String password) throws SQLException {
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from User where userName = ? and password =?";
		User user = queryRunner.query(conn, sql, new BeanHandler<>(User.class),userName,password);
		// 关闭连接
		DbUtils.close(conn);
		return user;
	}
}
