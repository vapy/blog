package com.vapy.behavior.TemplateMethod;
/**
 * 
 * @author vapy
 *
 */
public abstract class AbstractSort {
	protected abstract void sort(int[] array, int low, int high);
	
	public final void mainLogic(int[] array){
		this.sort(array, 0, array.length -1);
		System.out.println("打印结果");
		for(int i : array){
			System.out.print(i + " ");
		}
	}
}
