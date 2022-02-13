package Sdet_27.GenericUtility;

import java.util.Random;

/**
 * This class contains generic java specific generic methods
 * @author 91917
 *
 */
public class javaUtility
{
	/**
	 * this method will generate random value for every run
	 * @return
	 */
	public int getRandomNum() {
		Random ran = new Random();
		int value = ran.nextInt(100);
		return value;
		
	}
}