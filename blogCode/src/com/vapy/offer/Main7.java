package com.vapy.offer;
/**
 *
 * @author vapy 2016年9月29日
 *
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(func(input));
	}

	public static String func(String input) {
		Pattern p = Pattern.compile("[a-zA-Z]*");
		Matcher m = p.matcher(input);
		while (m.find()){
			String temp = m.group();
			input = input.replaceFirst(temp, new StringBuffer(temp).reverse().toString());
		}
		return input;
	}
}