package com.vapy.behavior.TemplateMethod;
/**
 * 
 * @author vapy
 *
 */
public class Client {
	public static void main(String[] args) {
		int[] a = {10,28,34,1,35,12,234,5,23};
		AbstractSort s = new ConcreteSort();
		s.mainLogic(a);
	}
}
