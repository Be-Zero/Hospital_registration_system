/**
 * 
 */
package com.etc.pojo;

/**
 * @author QTH
 * ����
 */
public class Patient {
	
	private int id; // ����id
	
	private String name; // ��������
	
	private String age; // ����
	
	private String sex; // �Ա�
	
	private String doc; // �Һ�ҽ��
	
	private String consulation;// ������Ϣ
	
	private int num; // �Ӻ�
	
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
	
    // �������޲ι���
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
