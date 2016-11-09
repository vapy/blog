package com.vapy.structure.flyweght;

/**
 * 
 * @author vapy 2016年11月9日
 *
 */

public class FlyweightTest {
	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "b";
		String str3 = "ab";
		
		String str4;
		str4 = str1 + str2;
		
		System.out.println(str3 == str4);
		str4 = (str1 + str2).intern();
		System.out.println(str3 == str4);
		
		Integer int1 = 100;
		Integer int2 = 100;
		Integer int3 = 1000;
		Integer int4 = 1000;
		
		System.out.println(int1 == int2);
		System.out.println(int3 == int4);
	}
}