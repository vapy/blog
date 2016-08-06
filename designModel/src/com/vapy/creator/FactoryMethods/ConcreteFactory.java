package com.vapy.creator.FactoryMethods;

/**
 * 
 * @author vapy
 *
 */
public class ConcreteFactory extends Factory {
	@Override
	public Product createProduct() {
		return new ConcreteProduct();
	}
}
