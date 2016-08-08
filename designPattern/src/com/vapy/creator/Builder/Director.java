package com.vapy.creator.Builder;
/**
 * 
 * @author vapy
 *
 */
public class Director {
	private Builder builder = new ConcreteBuilder();
	
	public Car getBMW(){
		builder.setPart("宝马","X7");
		return builder.getCar();
	}
	
	public Car getAudi(){
		builder.setPart("奥迪","Q5");
		return builder.getCar();
	}
}
