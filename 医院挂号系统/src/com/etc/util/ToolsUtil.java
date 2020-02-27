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
	 * 判断一个字符串是否为空  空 true
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
	 * 获取病人商品的二维数据
	 * @param goodses
	 * @return
	 */
	 public static Object[][] loadGoodsArray(List<Patient> goodses){
		 Object[][] goodsArray = new Object[goodses.size()][];
		 // 遍历list
		 for(int i = 0;i<goodses.size();i++){
			 Patient goods = goodses.get(i);
			 goodsArray[i] = new Object[]{goods.getId(),goods.getName(),goods.getSex(),goods.getAge(),goods.getDoc(),goods.getNum()};
		 }
		 return goodsArray;
	 }
	 
	 /**
	  * 获取医生的二维数组
	  * @param carts
	  * @return
	  */
	 public static Object[][] loadCartsArray(List<Doctor> carts){
		 Object[][] cartArray = new Object[carts.size()][];
		 // 遍历list
		 for(int i = 0;i<carts.size();i++){
			 Doctor cart = carts.get(i);
			 cartArray[i] = new Object[]{cart.getId(),cart.getName(),cart.getProfession()
					 ,cart.getDepartment(),cart.getPatientsNum()};
		 }
		 
		 return cartArray;
	 }
		
		/**
		 * 获取挂号信息
		 * @param carts
		 * @return
		 */
		public static int loadMmpArray(List<Doctor> carts){
			int mmp;
			// 遍历list
			Doctor cart = carts.get(0);
			mmp = cart.getPatientsNum();
			return mmp;
		 }
		
		/**
		 * 获取问诊信息
		 * @param carts
		 * @return
		 */
		public static String loadMmqArray(List<Patient> carts){
			String mmp;
			// 遍历list
			Patient cart = carts.get(0);
			mmp = cart.getConsulation();
			return mmp;
		 }
}
