package com.vapy.creator.Singleton;
/**
 * 
 * @author vapy
 *
 * 懒汉式单例
 *
 */
public class Singleton2 {
	private static Singleton2 singleton;
	
	private Singleton2(){
	}
	
	public static Singleton2 getInstance() {
		if(null == singleton) {
			singleton = new Singleton2();
		}
		return singleton;
	}
}