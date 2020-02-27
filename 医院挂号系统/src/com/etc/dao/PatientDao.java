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
 * ���ߵ�dao
 * @author QTH
 *
 */
public interface PatientDao {
	
	/**
	 * ��ѯȫ������
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Patient> queryPatient() throws SQLException;
	
	/**
	 * ���ݻ������ֲ�ѯ����
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Patient> queryPatientByName(String name) throws SQLException;
	
	/**
	 * ���Ӳ���
	 * @param patient
	 * @throws SQLException
	 */
	public abstract void addPatientImfor(Patient patient) throws SQLException;
	
	/**
	 * ����ҽ��
	 * @param docN
	 * @param name
	 * @throws SQLException
	 */
	public abstract void updateDoc(String docN,String name) throws SQLException ;
	
	/**
	 * �˹Һ�
	 * @param name
	 * @throws SQLException
	 */
	public abstract void updateGHGH(String name) throws SQLException ;
	
	/**
	 * ��ȡ�Һ�
	 * @param name
	 * @param goodsName
	 * @throws SQLException
	 */
	public abstract void obtainPatientImfor(String name, String goodsName) throws SQLException ;
	
	/**
	 * ����������Ϣ
	 * @param PatName
	 * @param consulation
	 * @throws SQLException
	 */
	public abstract void updateConsulation(String PatName,String consulation) throws SQLException ;

	/**
	 * ���ݻ�������  ��ѯҽ����Ϣ
	 * @param docName
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Patient> queryPatientByNameAndDoc(String docName) throws SQLException;
	
	/**
	 * ��ȡ������Ϣ
	 * @param goodsName
	 * @return
	 * @throws SQLException
	 */
	public abstract String obtainConsulationImfor(String goodsName) throws SQLException ;
	
	/**
	 * �����û��������� ��ѯ�û�
	 * @param ptientName
	 * @param patientDoc
	 * @return
	 * @throws SQLException
	 */
	public abstract Patient queryPatientByNameDoc(String ptientName,String patientDoc)  throws SQLException;	
}
