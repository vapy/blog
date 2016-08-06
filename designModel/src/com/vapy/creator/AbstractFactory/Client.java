package com.vapy.creator.AbstractFactory;
/**
 * 
 * @author vapy
 *
 */
public class Client {
	public static void main(String[] args) {
		IFactory factory = new Factory();
		factory.createIPhone().show();
		factory.createSamsung().show();
	}
}
