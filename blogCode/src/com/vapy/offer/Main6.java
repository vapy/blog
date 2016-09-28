package com.vapy.offer;
/**
 *
 * @author vapy 2016年9月28日
 *
 */
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String input = "";
		if (sc.hasNextInt()) {
			count = sc.nextInt();
		}
		if (sc.hasNext()) {
			input = sc.next();
		}
		if (count <= 0) {
			System.out.println("error");
		}
		else {
			StringBuffer sb = new StringBuffer();
			while (count-- > 0) {
				sb.append(input);
			}
			System.out.println(sb.toString());
		}
	}
}