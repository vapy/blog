package com.vapy.creator.Builder;
/**
 * 
 * @author vapy
 *
 */
public class Car {
	private String name;
	private String type;
	
	public void show(){
		System.out.print("name : " + name);
		System.out.println("\ttype : " + type);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}
}
