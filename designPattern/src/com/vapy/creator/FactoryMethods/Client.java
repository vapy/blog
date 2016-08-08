package com.vapy.creator.FactoryMethods;

/**
 * 
 * @author vapy
 *
 */
public class Client {
	public static void main(String[] args) {
		Factory factory = new ConcreteFactory(); 
		ConcreteProduct product = (ConcreteProduct) factory.createProduct();
		product.productMethod();
	}
}
