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
	
	public static User curUser = null; // �洢��ǰ��¼���û�
	
	public static Patient curPatient = null;
   
	// ����ȫ�ֱ���
	public static double totalPrice = 0.0; // �ܼ�
	public static double payPrice = 0.0; // ʵ��
	public static int totalNum=0; // ������
	public static int oldScore=0; // �ɻ���
	public static int curScore=0; // ��ǰ����
	public static int newScore=0; // �»���
	public static Object [][] cartsArray = null;
}
