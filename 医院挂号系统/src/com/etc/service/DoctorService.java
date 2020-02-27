/**
 * 
 */
package com.etc.service;
import java.sql.SQLException;
import java.util.List;
import com.etc.dao.DoctorDao;
import com.etc.dao.impl.DoctorDaoImpl;
import com.etc.pojo.Doctor;
import com.etc.pojo.Patient;
import com.etc.util.ToolsUtil;
import com.etc.dao.PatientDao;
/**
 * ҽ����service
 * @author QTH
 *
 */
public class DoctorService {
	
	// ע�� GoodsDao
	private static DoctorDao doctorDao = new DoctorDaoImpl();
	
	/**
	 * ��ѯ����ҽ��/ ��ID��ѯҽ��
	 * @param Name
	 * @return
	 * @throws SQLException
	 */
	public static List<Doctor> queryDoctor(String Name) throws SQLException{
		
		if(ToolsUtil.isEmpty(Name)){
			return doctorDao.queryDoctor();
		}
		return doctorDao.queryDoctorByName(Name);
	}
	
	/**
	 * �Һ�����
	 * @param goodsName
	 * @throws Exception
	 */
	public void addPatientsNum(String goodsName) throws Exception{

	    // �ֿ���ԭ�е�����
		doctorDao.updatePatientsNumByName(goodsName);
	}
	
	/**
	 * �Һż���
	 * @param goodsName
	 * @throws Exception
	 */
	public static void abatePatientsNum(String goodsName) throws Exception{

	    // �ֿ���ԭ�е�����
		doctorDao.abatePatientsNumByName(goodsName);
	}

	/**
	 * ���ҽ����Ϣ
	 * @param doctor
	 * @throws SQLException
	 */
	public static void addDoctorImfor(Doctor doctor) throws SQLException{
		doctorDao.addDoctor(doctor);
	}
	
	/**
	 * ɾ��ҽ����Ϣ
	 * @param docN
	 * @throws SQLException
	 */
	public static void deleteDoctorImfor(String docN) throws SQLException{
		doctorDao.deleteDoctor(docN);
	}
}