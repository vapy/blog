package com.vapy.creator.Singleton;

/**
 * 
 * @author vapy
 * 
 *         双重检验锁，线程安全
 * 
 */
public class DoubleChecked {
	private volatile static DoubleChecked singleton;

	private DoubleChecked() {
	}

	public static DoubleChecked getInstance() {
		if (null == singleton) {
			synchronized (singleton) {
				if (null == singleton) {
					singleton = new DoubleChecked();
				}
			}
		}
		return singleton;
	}
}