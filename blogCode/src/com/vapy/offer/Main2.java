package com.vapy.offer;

/**
 *
 * @author vapy 2016年9月19日
 *
 */
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = "";
		if (sc.hasNextLine()) {
			inputString = sc.nextLine();
		}
		String[] inputArrayInt = inputString.split(",");
		int len = inputArrayInt.length;
		int[] intArray = new int[len];
		for (int i = 0; i < len; i++) {
			intArray[i] = Integer.valueOf(inputArrayInt[i]);
		}
		func(intArray);
	}

	public static void func(int[] array) {
		int result = 0;
		if (array.length == 0) {
			System.out.println(0);
		}
		int max = array[0];
		int min = array[0];
		int max_index = 0;
		int min_index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= min) {
				min = array[i];
				min_index = i;
			}
			else if (array[i] >= max || (max_index <= min_index)) {
				max = array[i];
				max_index = i;
			}
			if (max_index >= min_index) {
				int temp = max - min;
				result = result >= temp ? result : temp;
			}
		}
		System.out.println(result);
	}
}