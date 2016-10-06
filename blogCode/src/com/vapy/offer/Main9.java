package com.vapy.offer;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 
 * @author vapy 2016年10月6日
 * 
 */

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] str = input.split(",");
		BigDecimal[] bgInput = new BigDecimal[str.length];
		BigDecimal result = new BigDecimal(0);
		for (int i = 0, len = str.length; i < len; i++) {
			str[i] = str[i].replaceAll("\"", "");
			str[i] = str[i].replaceAll(" ", "");
			result = result.add(new BigDecimal(str[i]));
		}
		System.out.println(result.setScale(20, BigDecimal.ROUND_HALF_UP));
	}
}