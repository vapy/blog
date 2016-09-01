package com.vapy.offer;
/**
 *
 * @author vapy 2016年8月29日
 *
 */
public class Add {
	public static void main(String[] args) {
		System.out.println(add(23,-24));
	}
	
	public static int add(int num1, int num2) {
		if(0 == num2) {
			return num1;
		}
		return add(num1^num2, (num1&num2)<<1);
	}
}

