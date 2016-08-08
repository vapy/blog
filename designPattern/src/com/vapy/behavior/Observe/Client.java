package com.vapy.behavior.Observe;
/**
 * 
 * @author vapy
 * 
 * 观察者模式
 *
 */
public class Client {
	public static void main(String[] args) {
		Subject sub = new Mouse();
		sub.addObserver(new MouseListener1());
		sub.addObserver(new MouseListener2());
		sub.click();
	}
}
