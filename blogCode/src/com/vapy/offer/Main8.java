package com.vapy.offer;

import java.util.Scanner;

/**
 * 
 * @author vapy 2016年10月6日
 * 
 */

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		// 去掉 ' , '
		input = input.replaceAll(",", "");
		input = input.replaceAll("'", "");
		input = input.replaceAll(" ", "");
		String temp = sort(input);
		// 合并，加上 ' , '
		String result = "'";
		char[] ch = temp.toCharArray();
		for (char c : ch) {
			result += c + "' , '";
		}
		// 之所以要减4是由于result最后一个字母后面有 ' , ' ，而只需要一个 ' 就够了
		result = result.substring(0, result.length() - 4);
		System.out.println(result);
	}

	public static String sort(String str) {
		char[] s1 = str.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < i; j++) {
				if (s1[i] < s1[j]) {
					char temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
			}
		}
		return String.valueOf(s1);
	}
}