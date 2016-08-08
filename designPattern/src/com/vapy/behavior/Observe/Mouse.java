package com.vapy.behavior.Observe;
/**
 * 
 * @author vapy
 *
 */
public class Mouse extends Subject {
	@Override
	public void click() {
		System.out.println("i am a mouse, click");
		this.notifyObservers();
	}
}
