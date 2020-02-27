/**
 * 
 */
package com.etc.pojo;
/**
 * @author Administrator
 * 商品
 */
public class Doctor {
	
	private int id; // 医生id
	
	private String name; // 医生名称
	
	private String profession; // 所属类别
	
	private String department;//所属科室
	
	private int num; // 出诊次数
	
	private int patientsNum; // 当前等候人数
	
    // 必须有无参构造
	public Doctor() {
		super();
	}

	public Doctor(String name,String department, String profession) {
		super();
		this.name = name;
		this.profession = profession ;
		this.department = department;
	}

	public Doctor(int id, String name, String profession, String department, int num) {
		super();
		this.id = id;
		this.name = name;
		this.profession = profession;
		this.department = department;
		this.num = num;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPatientsNum() {
		return patientsNum;
	}
	
	public void setPatientsNum(int patientsNum) {
		this.patientsNum = patientsNum;
	}
}