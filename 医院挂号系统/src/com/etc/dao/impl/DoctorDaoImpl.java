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
	public void addDoctor(Doctor doctor) throws SQLException {//����ҽ��
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
	public List<Doctor> queryDoctorByName(String name) throws SQLException {//����ҽ�����Ʋ�ѯҽ��
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		// ģ����ѯ
		String sql = "select * from Doctor where name like ?";
		List<Doctor> doctor = queryRunner.query(conn, sql, new BeanListHandler<>(Doctor.class),"%"+name+"%");
		DbUtils.close(conn);
		return doctor;
	}
	
	@Override
	public void updatePatientsNumByName(String name) throws SQLException {//����ҽ�����Ƹ��ĹҺ�����
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "update Doctor set PatientsNum=PatientsNum+1 where name = ?";
		queryRunner.update(conn, sql, name);
		DbUtils.close(conn);
	}

	@Override
	public List<Doctor> queryDoctor() throws SQLException{//��ѯȫ��ҽ��
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from Doctor";
		List<Doctor> doctor = queryRunner.query(conn, sql, new BeanListHandler<>(Doctor.class));
		DbUtils.close(conn);
		return doctor;
	}

	@Override
	public void deleteDoctor(String name) throws SQLException {//����ҽ��
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
	public Doctor queryGoodsByName(String name) throws SQLException{//�������ֲ�ѯҽ����Ϣ
		// TODO Auto-generated method stub
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from Doctor where name = ?";
		Doctor goods = queryRunner.query(conn, sql, new BeanHandler<>(Doctor.class),name);
		DbUtils.close(conn);
		return goods;
	}

	@Override
	public void abatePatientsNumByName(String name) throws SQLException {//�������ּ���ҽ��
		// TODO �Զ����ɵķ������
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		String sql = "update Doctor set PatientsNum=PatientsNum-1 where name = ?";
		queryRunner.update(conn, sql, name);
		DbUtils.close(conn);
	}
	
	@Override
	public List<Patient> queryPatientByNameAndDoct(String docName) throws SQLException {//���ݻ�������ҽ����ѯҽ����Ϣ
		// TODO �Զ����ɵķ������
		Connection conn = MysqlUtil.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		// ģ����ѯ
		String sql = "select * from Patient where doc like ?";
		List<Patient> patient = queryRunner.query(conn, sql, new BeanListHandler<>(Patient.class),"%"+docName+"%");
		DbUtils.close(conn);
		return patient;
	}	
}