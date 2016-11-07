package com.vapy.offer;
/**
 *
 * @author vapy 2016年9月19日
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int des = 0;
		int count = 0;
		if (sc.hasNextInt()) {
			des = sc.nextInt();
		}
		if (sc.hasNextInt()) {
			count = sc.nextInt();
		}
		sc.close();
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(func(array, des));
	}

	public static int func(int[] array, int des) {
		boolean flag = false;
		for (int i : array) {
			if (i == des) {
				flag = true;
				break;
			}
		}
		if (flag) {
			return binary(array, des);
		}
		else {
			int[] arr = new int[array.length + 1];
			arr[0] = des;
			System.arraycopy(array, 0, arr, 1, array.length);
			Arrays.sort(arr);
			return -1 - binary(arr, des);
		}
	}

	public static int binary(int[] array, int des) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int middle = low + ((high - low) >> 1);
			if (des == array[middle]) {
				return middle;
			}
			else if (des < array[middle]) {
				high = middle - 1;
			}
			else {
				low = middle + 1;
			}
			if (low == high) {
				return low;
			}
		}
		return -1;
	}
}
