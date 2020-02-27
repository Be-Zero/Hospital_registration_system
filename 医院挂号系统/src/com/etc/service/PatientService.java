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
	// 注入 GoodsDao
		private static PatientDao patientDao = new PatientDaoImpl();
		
		/**
		 * 查询所有患者/ 按编号查询患者
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
		 * 添加病人信息
		 * @return
		 * @throws SQLException 
		 */
		public static void addPatient(Patient patient) throws SQLException{
			patientDao.addPatientImfor(patient);
		}
		
		/**
		 * 添加医生信息
		 * @return
		 * @throws SQLException 
		 */
		public static void addDoc(String docN,String name) throws SQLException{
			patientDao.updateDoc(docN,name);	
		}
		
		/**
		 * 删除医生信息
		 * @return
		 * @throws SQLException 
		 */
		public static void updateGH(String name) throws SQLException{
			patientDao.updateGHGH(name);
		}
		
		/**
		 * 获取挂号信息
		 * @return
		 * @throws SQLException 
		 */
		public static void obtainPatient(String name,String goodsName) throws SQLException{
			patientDao.obtainPatientImfor(name,goodsName);
		}
		
		/**
		 * 添加问诊信息
		 * @return
		 * @throws SQLException 
		 */
		public static void addConsulation(String PatName,String consulation) throws SQLException{
			patientDao.updateConsulation(PatName,consulation);
		}
		
		/**
		 * 查询所有商品/ 按编号查询商品
		 * @return
		 * @throws SQLException 
		 */
		public static List<Patient> queryPatientByDoc(String docName) throws SQLException{
			
			return patientDao.queryPatientByNameAndDoc(docName);
		}

		/**
		 * 获取问诊信息
		 * @return
		 * @throws SQLException 
		 */
		public static String obtainConsulation(String goodsName) throws SQLException{
			return patientDao.obtainConsulationImfor(goodsName);
		}
	
		/**
		 * 登录
		 * @param userName
		 * @param password
		 * @return
		 * @throws SQLException 
		 */
		public static Patient login(String ptientName,String patientDoc) throws SQLException{
			return patientDao.queryPatientByNameDoc(ptientName, patientDoc);
		}
}
