package com.vapy.offer;
/**
 *
 * @author vapy 2016年9月28日
 *
 */
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		if (sc.hasNextInt()) {
			count = sc.nextInt();
			sc.nextLine();
		}
		sc.close();
		String[] input = new String[count];
		for (int i = 0; i < count; i++) {
			input[i] = sc.nextLine();
		}
		sc.close();
		func(input);
		for (String s : input) {
			System.out.println(s);
		}
	}

	public static void func(String[] input) {
		for(int i = 0, len = input.length; i < len; i ++) {
			input[i] = func2(input[i]);
		}
	}

	public static String func2(String str) {
		String[] temp = str.split(" ");
		String result = "";
		for (int i = temp.length - 1; i >= 0; i--) {
			if (i == 0) {
				result += temp[i];
			}
			else {
				result = result + temp[i] + " ";
			}
		}
		return result;
	}
}

