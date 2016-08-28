package com.vapy.structure.Adapter;
/**
 *
 * @author vapy 2016年8月28日
 *
 */
public class Client {
	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.adapteeMethod();
		target.adapterMethod();
	}
}