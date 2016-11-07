package com.vapy.offer;
/**
 *
 * @author vapy 2016年9月28日
 *
 */
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while(sc.hasNextInt()) {
			input = sc.nextInt();
			func(input);
		}
		sc.close();
	}
	
	public static void func(int input) {
		int exp = 75;
		if(input < 2 || input > 100) {
			System.out.println("no");
			return;
		}
		int result = 1;
		while(input > 0) {
			if(exp < 200) {
				exp += 3;
				
			} else if(exp < 400) {
				exp += 6;
				result = 2;
			} else if(exp < 600){
				exp += 12;
				result = 3;
			} else {
				exp += 24;
				result = 4;
			}
			input --;
		}
		System.out.println(result);
	}
}