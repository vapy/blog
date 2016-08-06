package com.vapy.behavior.TemplateMethod;
/**
 * 
 * @author vapy
 *
 */
public class ConcreteSort extends AbstractSort {
	@Override
	protected void sort(int[] array, int low, int high) {
		{
			int l = low;
			int h = high;
			int povit = array[low];
			while (l < h) {
				while (l < h && array[h] >= povit) {
					h--;
				}
				if (l < h) {
					swap(array, h, l);
					l++;
				}
				while (l < h && array[l] <= povit) {
					l++;
				}
				if (l < h) {
					swap(array, h, l);
					h--;
				}
			}
			if (l > low) {
				sort(array, low, l - 1);
			}
			if (h < high) {
				sort(array, l + 1, high);
			}
		}
	}
	
	private void swap(int[] array, int i, int j) {
		array[i] = array[i] ^ array[j];
		array[j] = array[i] ^ array[j];
		array[i] = array[i] ^ array[j];
	}
}
