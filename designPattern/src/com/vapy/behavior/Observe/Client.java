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
		Subject sub = new MousePad();
		sub.addObserver(new MousePadListener1());
		sub.addObserver(new MousePadListener2());
		sub.doSomething();
	}
}
