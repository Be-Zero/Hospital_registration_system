/**
 * 
 */
package com.etc.util;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import com.etc.pojo.Doctor;
import com.etc.pojo.Patient;
/**
 * @author Administrator
 *
 */
public class ToolsUtil {
	
	/**
	 * �ж�һ���ַ����Ƿ�Ϊ��  �� true
	 * @param value
	 * @return
	 */
	public static boolean isEmpty(String value){
		
		if(value != null && !"".equals(value)){
			return false;
		}
		return true;
	}
	
	/**
	 * ��ȡ������Ʒ�Ķ�ά����
	 * @param goodses
	 * @return
	 */
	 public static Object[][] loadGoodsArray(List<Patient> goodses){
		 Object[][] goodsArray = new Object[goodses.size()][];
		 // ����list
		 for(int i = 0;i<goodses.size();i++){
			 Patient goods = goodses.get(i);
			 goodsArray[i] = new Object[]{goods.getId(),goods.getName(),goods.getSex(),goods.getAge(),goods.getDoc(),goods.getNum()};
		 }
		 return goodsArray;
	 }
	 
	 /**
	  * ��ȡҽ���Ķ�ά����
	  * @param carts
	  * @return
	  */
	 public static Object[][] loadCartsArray(List<Doctor> carts){
		 Object[][] cartArray = new Object[carts.size()][];
		 // ����list
		 for(int i = 0;i<carts.size();i++){
			 Doctor cart = carts.get(i);
			 cartArray[i] = new Object[]{cart.getId(),cart.getName(),cart.getProfession()
					 ,cart.getDepartment(),cart.getPatientsNum()};
		 }
		 
		 return cartArray;
	 }
		
		/**
		 * ��ȡ�Һ���Ϣ
		 * @param carts
		 * @return
		 */
		public static int loadMmpArray(List<Doctor> carts){
			int mmp;
			// ����list
			Doctor cart = carts.get(0);
			mmp = cart.getPatientsNum();
			return mmp;
		 }
		
		/**
		 * ��ȡ������Ϣ
		 * @param carts
		 * @return
		 */
		public static String loadMmqArray(List<Patient> carts){
			String mmp;
			// ����list
			Patient cart = carts.get(0);
			mmp = cart.getConsulation();
			return mmp;
		 }
}
