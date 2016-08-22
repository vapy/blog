package com.vapy.creator.Singleton;
/**
 * 
 * @author vapy
 *
 * 饿汉式单例
 * 
 */
public class Singleton {
	private static final Singleton singleton = new Singleton();
	
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
}