/**
 * 
 */
package com.etc.dao;
import java.sql.SQLException;
import java.util.List;
import com.etc.pojo.Doctor;
import com.etc.pojo.Patient;

/**
 * 医生的dao
 * @author QTH
 *
 */
public interface DoctorDao {
	
	/**
	 * 查询全部医生
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Doctor> queryDoctor() throws SQLException;
	
	/**
	 * 根据医生名字查询医生
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Doctor> queryDoctorByName(String name) throws SQLException ;
		// TODO 自动生成的方法存根
	
	/**
	 * 根据医生名称更改挂号数量
	 * @param name
	 * @throws SQLException
	 */
	public abstract void updatePatientsNumByName(String name) throws SQLException ;
		// TODO 自动生成的方法存根
		
	/**
	 * 增加医生
	 * @param doctor
	 * @throws SQLException
	 */
	public  abstract void addDoctor(Doctor doctor) throws SQLException;
	
	/**
	 * 减少医生
	 * @param name
	 * @throws SQLException
	 */
	public abstract void deleteDoctor(String name) throws SQLException;
	
	/**
	 * 根据医生名字查询信息
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public abstract Doctor queryGoodsByName(String name) throws SQLException;
	
	/**
	 * 根据医生名称删除医生
	 * @param name
	 * @throws SQLException
	 */
	public abstract void abatePatientsNumByName(String name) throws SQLException ;
	
	/**
	 * 根据患者所挂医生查询医生信息
	 * @param docName
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Patient> queryPatientByNameAndDoct(String docName) throws SQLException;
}