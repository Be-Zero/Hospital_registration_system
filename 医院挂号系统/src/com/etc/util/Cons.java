/**
 * 
 */
package com.etc.util;

import com.etc.pojo.User;
import com.etc.pojo.Patient;

/**
 * @author QTH
 *
 */
public class Cons {
	
	public static User curUser = null; // 存储当前登录的用户
	
	public static Patient curPatient = null;
   
	// 定义全局变量
	public static double totalPrice = 0.0; // 总价
	public static double payPrice = 0.0; // 实收
	public static int totalNum=0; // 总数量
	public static int oldScore=0; // 旧积分
	public static int curScore=0; // 当前积分
	public static int newScore=0; // 新积分
	public static Object [][] cartsArray = null;
}
