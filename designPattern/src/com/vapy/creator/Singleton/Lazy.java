package com.vapy.creator.Singleton;
/**
 * 
 * @author vapy
 *
 * 懒汉式单例，线程安全
 *
 */
public class Lazy {
	private static Lazy singleton;
	
	private Lazy(){
	}
	
	public static synchronized Lazy getInstance() {
		if(null == singleton) {
			singleton = new Lazy();
		}
		return singleton;
	}
}