/**
 * 
 */
package com.etc.dao;
import java.sql.SQLException;
import com.etc.pojo.User;
/**
 * �������ݿ���Դ��
 * @author QTH
 *
 */
public interface UserDao {
	
	/**
	 * �����û��������� ��ѯ�û�
	 * @param userName
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	public abstract User queryUserByNamePwd(String userName,String password)  throws SQLException;
}
