/**
 * 
 */
package com.etc.dao;
import java.sql.SQLException;
import java.util.List;
import com.etc.pojo.Doctor;
import com.etc.pojo.Patient;

/**
 * ҽ����dao
 * @author QTH
 *
 */
public interface DoctorDao {
	
	/**
	 * ��ѯȫ��ҽ��
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Doctor> queryDoctor() throws SQLException;
	
	/**
	 * ����ҽ�����ֲ�ѯҽ��
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Doctor> queryDoctorByName(String name) throws SQLException ;
		// TODO �Զ����ɵķ������
	
	/**
	 * ����ҽ�����Ƹ��ĹҺ�����
	 * @param name
	 * @throws SQLException
	 */
	public abstract void updatePatientsNumByName(String name) throws SQLException ;
		// TODO �Զ����ɵķ������
		
	/**
	 * ����ҽ��
	 * @param doctor
	 * @throws SQLException
	 */
	public  abstract void addDoctor(Doctor doctor) throws SQLException;
	
	/**
	 * ����ҽ��
	 * @param name
	 * @throws SQLException
	 */
	public abstract void deleteDoctor(String name) throws SQLException;
	
	/**
	 * ����ҽ�����ֲ�ѯ��Ϣ
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public abstract Doctor queryGoodsByName(String name) throws SQLException;
	
	/**
	 * ����ҽ������ɾ��ҽ��
	 * @param name
	 * @throws SQLException
	 */
	public abstract void abatePatientsNumByName(String name) throws SQLException ;
	
	/**
	 * ���ݻ�������ҽ����ѯҽ����Ϣ
	 * @param docName
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Patient> queryPatientByNameAndDoct(String docName) throws SQLException;
}