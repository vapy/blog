package com.vapy.creator.Singleton;
/**
 * 
 * @author vapy
 *
 * 饿汉式单例，线程安全
 * 
 */
public class Hungry {
	private static final Hungry singleton = new Hungry();
	
	private Hungry(){
	}
	
	public static Hungry getInstance(){
		return singleton;
	}
}