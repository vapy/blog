package com.vapy.creator.Builder;
/**
 * 
 * @author vapy
 *
 */
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		Car bmw = director.getBMW();
		bmw.show();
		
		Car audi = director.getAudi();
		audi.show();
	}
}
