package com.etc.pojo;

public class staticAll {
	private static String userName;
	
	private static String chooseDoctorName;
	
	public static String getChooseDoctorName() {
		return chooseDoctorName;
	}

	public static void setChooseDoctorName(String chooseDoctorName) {
		staticAll.chooseDoctorName = chooseDoctorName;
	}

	public static String getUserName() {
		return userName;
	}

	public static void setUserName(String userName) {
		staticAll.userName = userName;
	}
}
