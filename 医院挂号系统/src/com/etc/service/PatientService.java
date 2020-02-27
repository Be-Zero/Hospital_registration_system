package com.etc.service;
import java.sql.SQLException;
import java.util.List;
import com.etc.dao.DoctorDao;
import com.etc.dao.PatientDao;
import com.etc.dao.impl.PatientDaoImpl;
import com.etc.pojo.Doctor;
import com.etc.pojo.Patient;
import com.etc.pojo.User;
import com.etc.util.ToolsUtil;

public class PatientService {
	// ע�� GoodsDao
		private static PatientDao patientDao = new PatientDaoImpl();
		
		/**
		 * ��ѯ���л���/ ����Ų�ѯ����
		 * @return
		 * @throws SQLException 
		 */
		public static List<Patient> queryPatient(String patientName) throws SQLException{
			
			if(ToolsUtil.isEmpty(patientName)){
				return patientDao.queryPatient();
			}
			return patientDao.queryPatientByName(patientName);
		}
		
		/**
		 * ��Ӳ�����Ϣ
		 * @return
		 * @throws SQLException 
		 */
		public static void addPatient(Patient patient) throws SQLException{
			patientDao.addPatientImfor(patient);
		}
		
		/**
		 * ���ҽ����Ϣ
		 * @return
		 * @throws SQLException 
		 */
		public static void addDoc(String docN,String name) throws SQLException{
			patientDao.updateDoc(docN,name);	
		}
		
		/**
		 * ɾ��ҽ����Ϣ
		 * @return
		 * @throws SQLException 
		 */
		public static void updateGH(String name) throws SQLException{
			patientDao.updateGHGH(name);
		}
		
		/**
		 * ��ȡ�Һ���Ϣ
		 * @return
		 * @throws SQLException 
		 */
		public static void obtainPatient(String name,String goodsName) throws SQLException{
			patientDao.obtainPatientImfor(name,goodsName);
		}
		
		/**
		 * ���������Ϣ
		 * @return
		 * @throws SQLException 
		 */
		public static void addConsulation(String PatName,String consulation) throws SQLException{
			patientDao.updateConsulation(PatName,consulation);
		}
		
		/**
		 * ��ѯ������Ʒ/ ����Ų�ѯ��Ʒ
		 * @return
		 * @throws SQLException 
		 */
		public static List<Patient> queryPatientByDoc(String docName) throws SQLException{
			
			return patientDao.queryPatientByNameAndDoc(docName);
		}

		/**
		 * ��ȡ������Ϣ
		 * @return
		 * @throws SQLException 
		 */
		public static String obtainConsulation(String goodsName) throws SQLException{
			return patientDao.obtainConsulationImfor(goodsName);
		}
	
		/**
		 * ��¼
		 * @param userName
		 * @param password
		 * @return
		 * @throws SQLException 
		 */
		public static Patient login(String ptientName,String patientDoc) throws SQLException{
			return patientDao.queryPatientByNameDoc(ptientName, patientDoc);
		}
}
