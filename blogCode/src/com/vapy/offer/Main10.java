package com.vapy.offer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 * @author vapy 2016年10月6日
 * 
 */

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		if (sc.hasNext()) {
			input = sc.next();
		}
		sc.close();
		String[] str = input.split("-");
		int[] intInput = new int[str.length];
		for (int i = 0, len = str.length; i < len; i++) {
			intInput[i] = Integer.valueOf(str[i]);
		}

		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
		Calendar c = Calendar.getInstance();
		c.set(intInput[0], intInput[1] - 1, intInput[2]);
		c.add(Calendar.MONTH, -1);
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		String first = format.format(c.getTime());
		System.out.println(first);
	}
}