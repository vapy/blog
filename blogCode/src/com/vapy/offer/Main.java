package com.vapy.offer;

/**
 *
 * @author vapy 2016年9月10日
 *
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String[] str = new String[3];
			for (int i = 0; i < 3; i++) {
				str[i] = sc.nextLine();
			}
			System.out.println(func(str[0], str[1], str[2]));
		}
		sc.close();
	}

	public static String func(String str, String a, String b) {
		String regex = ".*" + a + ".*" + b + ".*";
		String str2 = new StringBuffer(str).reverse().toString();
		if (str.matches(regex) && str2.matches(regex))
			return "both";
		if (str.matches(regex))
			return "forward";
		if (str2.matches(regex))
			return "backward";
		return "invalid";
	}
}