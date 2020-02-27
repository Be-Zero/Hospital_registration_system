/**
 * 
 */
package com.etc.dao;
import java.sql.SQLException;
import java.util.List;
import com.etc.pojo.Doctor;
import com.etc.pojo.Patient;
import com.etc.pojo.User;
/**
 * 患者的dao
 * @author QTH
 *
 */
public interface PatientDao {
	
	/**
	 * 查询全部患者
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Patient> queryPatient() throws SQLException;
	
	/**
	 * 根据患者名字查询患者
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Patient> queryPatientByName(String name) throws SQLException;
	
	/**
	 * 增加病人
	 * @param patient
	 * @throws SQLException
	 */
	public abstract void addPatientImfor(Patient patient) throws SQLException;
	
	/**
	 * 更新医生
	 * @param docN
	 * @param name
	 * @throws SQLException
	 */
	public abstract void updateDoc(String docN,String name) throws SQLException ;
	
	/**
	 * 退挂号
	 * @param name
	 * @throws SQLException
	 */
	public abstract void updateGHGH(String name) throws SQLException ;
	
	/**
	 * 获取挂号
	 * @param name
	 * @param goodsName
	 * @throws SQLException
	 */
	public abstract void obtainPatientImfor(String name, String goodsName) throws SQLException ;
	
	/**
	 * 更新问诊信息
	 * @param PatName
	 * @param consulation
	 * @throws SQLException
	 */
	public abstract void updateConsulation(String PatName,String consulation) throws SQLException ;

	/**
	 * 根据患者名称  查询医生信息
	 * @param docName
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Patient> queryPatientByNameAndDoc(String docName) throws SQLException;
	
	/**
	 * 获取问诊信息
	 * @param goodsName
	 * @return
	 * @throws SQLException
	 */
	public abstract String obtainConsulationImfor(String goodsName) throws SQLException ;
	
	/**
	 * 根据用户名和密码 查询用户
	 * @param ptientName
	 * @param patientDoc
	 * @return
	 * @throws SQLException
	 */
	public abstract Patient queryPatientByNameDoc(String ptientName,String patientDoc)  throws SQLException;	
}
