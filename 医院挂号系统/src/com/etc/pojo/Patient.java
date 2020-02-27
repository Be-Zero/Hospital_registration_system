/**
 * 
 */
package com.etc.pojo;

/**
 * @author QTH
 * 患者
 */
public class Patient {
	
	private int id; // 病人id
	
	private String name; // 病人名称
	
	private String age; // 年龄
	
	private String sex; // 性别
	
	private String doc; // 挂号医生
	
	private String consulation;// 问诊信息
	
	private int num; // 队号
	
	public String getSex() {
		return sex;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String getConsulation() {
		return consulation;
	}

	public void setConsulation(String consulation) {
		this.consulation = consulation;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
    // 必须有无参构造
	public Patient() {
		super();
	}

	public Patient(String name, String sex,String age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Patient(String name) {
		super();

		this.name = name;

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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}
