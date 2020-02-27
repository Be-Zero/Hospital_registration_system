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
import org.apache.commons.dbutils.handlers.ScalarHandler;
import com.etc.dao.DoctorDao;
import com.etc.pojo.Doctor;
import com.etc.pojo.Patient;
import com.etc.pojo.User;
import com.etc.pojo.staticAll;
import com.etc.service.DoctorService;
import com.etc.util.MysqlUtil;
import com.etc.util.ToolsUtil;
/**
 * @author Administrator
 *
 */
public class DoctorDaoImpl implements DoctorDao {

	@Override
	public void addDoctor(Doctor doctor) throws SQLException {//增加医生
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "insert into Doctor(name,department,profession) values(?,?,?)";
		queryRunner.update(conn, sql, doctor.getName(),doctor.getDepartment(),doctor.getProfession());
		
		sql = "insert into User(userName,passWord,role) values(?,?,?)";
		queryRunner.update(conn, sql, doctor.getName(),doctor.getName(),0);
		DbUtils.close(conn);
	}

	@Override
	public List<Doctor> queryDoctorByName(String name) throws SQLException {//根据医生名称查询医生
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		// 模糊查询
		String sql = "select * from Doctor where name like ?";
		List<Doctor> doctor = queryRunner.query(conn, sql, new BeanListHandler<>(Doctor.class),"%"+name+"%");
		DbUtils.close(conn);
		return doctor;
	}
	
	@Override
	public void updatePatientsNumByName(String name) throws SQLException {//根据医生名称更改挂号数量
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "update Doctor set PatientsNum=PatientsNum+1 where name = ?";
		queryRunner.update(conn, sql, name);
		DbUtils.close(conn);
	}

	@Override
	public List<Doctor> queryDoctor() throws SQLException{//查询全部医生
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from Doctor";
		List<Doctor> doctor = queryRunner.query(conn, sql, new BeanListHandler<>(Doctor.class));
		DbUtils.close(conn);
		return doctor;
	}

	@Override
	public void deleteDoctor(String name) throws SQLException {//减少医生
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "delete from Doctor where name = ?";
		queryRunner.update(conn, sql, name);
		sql = "delete from User where userName = ?";
		queryRunner.update(conn, sql, name);
		DbUtils.close(conn);
		
	}
	
	@Override
	public Doctor queryGoodsByName(String name) throws SQLException{//根据名字查询医生信息
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from Doctor where name = ?";
		Doctor goods = queryRunner.query(conn, sql, new BeanHandler<>(Doctor.class),name);
		DbUtils.close(conn);
		return goods;
	}

	@Override
	public void abatePatientsNumByName(String name) throws SQLException {//根据名字减少医生
		// TODO 自动生成的方法存根
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "update Doctor set PatientsNum=PatientsNum-1 where name = ?";
		queryRunner.update(conn, sql, name);
		DbUtils.close(conn);
	}
	
	@Override
	public List<Patient> queryPatientByNameAndDoct(String docName) throws SQLException {//根据患者所挂医生查询医生信息
		// TODO 自动生成的方法存根
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		// 模糊查询
		String sql = "select * from Patient where doc like ?";
		List<Patient> patient = queryRunner.query(conn, sql, new BeanListHandler<>(Patient.class),"%"+docName+"%");
		DbUtils.close(conn);
		return patient;
	}	
}