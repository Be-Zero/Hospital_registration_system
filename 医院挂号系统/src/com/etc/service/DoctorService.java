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
 * 医生的service
 * @author QTH
 *
 */
public class DoctorService {
	
	// 注入 GoodsDao
	private static DoctorDao doctorDao = new DoctorDaoImpl();
	
	/**
	 * 查询所有医生/ 按ID查询医生
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
	 * 挂号增加
	 * @param goodsName
	 * @throws Exception
	 */
	public void addPatientsNum(String goodsName) throws Exception{

	    // 仓库中原有的数量
		doctorDao.updatePatientsNumByName(goodsName);
	}
	
	/**
	 * 挂号减少
	 * @param goodsName
	 * @throws Exception
	 */
	public static void abatePatientsNum(String goodsName) throws Exception{

	    // 仓库中原有的数量
		doctorDao.abatePatientsNumByName(goodsName);
	}

	/**
	 * 添加医生信息
	 * @param doctor
	 * @throws SQLException
	 */
	public static void addDoctorImfor(Doctor doctor) throws SQLException{
		doctorDao.addDoctor(doctor);
	}
	
	/**
	 * 删除医生信息
	 * @param docN
	 * @throws SQLException
	 */
	public static void deleteDoctorImfor(String docN) throws SQLException{
		doctorDao.deleteDoctor(docN);
	}
}