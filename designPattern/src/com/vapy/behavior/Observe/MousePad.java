package com.vapy.behavior.Observe;
/**
 * 
 * @author vapy
 *
 */
public class MousePad extends Subject {
	@Override
	public void doSomething() {
		System.out.println("i am a mouse pad, click");
		this.notifyObserver();
	}
}
