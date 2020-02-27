/**
 * 
 */
package com.etc.dao.impl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.etc.dao.PatientDao;
import com.etc.pojo.User;
import com.etc.service.DoctorService;
import com.etc.service.PatientService;
import com.etc.pojo.Doctor;
import com.etc.pojo.Patient;
import com.etc.util.MysqlUtil;
import com.etc.util.ToolsUtil;
/**
 * @author QTH
 *
 */
public class PatientDaoImpl implements PatientDao {

	@Override
	public List<Patient> queryPatient() throws SQLException {//查询全部病人
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from Patient";
		List<Patient> patient = queryRunner.query(conn, sql, new BeanListHandler<>(Patient.class));
		DbUtils.close(conn);
		return patient;
	}

	@Override
	public List<Patient> queryPatientByName(String name) throws SQLException {//根据患者名称查询患者
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		// 模糊查询
		String sql = "select * from Patient where name like ?";
		List<Patient> patient = queryRunner.query(conn, sql, new BeanListHandler<>(Patient.class),"%"+name+"%");
		DbUtils.close(conn);
		return patient;
	}

	@Override
	public void updateConsulation(String PatName, String consulation) throws SQLException {// 根据名字更改问诊信息
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "update Patient set consulation = ? where name = ?";
		queryRunner.update(conn, sql, consulation, PatName);
		DbUtils.close(conn);
	}

	@Override
	public void addPatientImfor(Patient patient) throws SQLException {//增加病人
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "insert into Patient(name,sex,age) values(?,?,?)";
		queryRunner.update(conn, sql, patient.getName(),patient.getSex(),patient.getAge());
		sql = "insert into User(UserName,passWord,role) values(?,?,?)";
		queryRunner.update(conn, sql, patient.getName(),patient.getName(),2);
		DbUtils.close(conn);
	}
	
	@Override
	public void updateDoc(String docN,String name) throws SQLException {// 根据名字更改医生信息
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "update Patient set doc = ? where name = ?";
		queryRunner.update(conn, sql, docN, name);
		DbUtils.close(conn);
	}
	
	@Override
	public void updateGHGH(String name) throws SQLException {// 根据名字删除挂号信息
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "delete from Patient where name = ?";
		queryRunner.update(conn, sql, name);
		sql = "delete from User where userName = ?";
		queryRunner.update(conn, sql, name);
		DbUtils.close(conn);
	}

	@Override
	public void obtainPatientImfor(String name, String goodsName) throws SQLException {//根据获取挂号
		// TODO 自动生成的方法存根
		int mmp;
		DoctorService doctorService = new DoctorService();
		List<Doctor> goodses = doctorService.queryDoctor(goodsName);
 		// 将 list 转为 二维数据
 		mmp = ToolsUtil.loadMmpArray(goodses);
 		int ppx=mmp;
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "update Patient set num= ? where name = ?";
		queryRunner.update(conn, sql, ppx, name);
		DbUtils.close(conn);		
	}

	@Override
	public List<Patient> queryPatientByNameAndDoc(String docName) throws SQLException {// 根据患者所挂医生查询患者
		// TODO 自动生成的方法存根
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		// 模糊查询
		String sql = "select * from Patient where doc like ?";
		List<Patient> patient = queryRunner.query(conn, sql, new BeanListHandler<>(Patient.class),"%"+docName+"%");
		DbUtils.close(conn);
		return patient;
	}
	
	@Override
	public String obtainConsulationImfor(String goodsName) throws SQLException {//获取问诊信息
		// TODO 自动生成的方法存根
		String mmp;
		PatientService patientService = new PatientService();
		List<Patient> goodses = patientService.queryPatient(goodsName);
 		// 将 list 转为 二维数据
 		mmp = ToolsUtil.loadMmqArray(goodses);
 		return mmp;	
	}
	
	/**
	 * 通过用户名和密码 查询用户
	 * @throws SQLException 
	 */
	@Override
	public Patient queryPatientByNameDoc(String ptientName, String patientDoc) throws SQLException {//根据所挂医生姓名查询患者
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from Patient where name = ? and doc =?";
		Patient patient = queryRunner.query(conn, sql, new BeanHandler<>(Patient.class),ptientName,patientDoc);
		// 关闭连接
		DbUtils.close(conn);
		return patient;
	}
}