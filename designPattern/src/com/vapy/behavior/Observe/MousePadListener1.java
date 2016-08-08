package com.vapy.behavior.Observe;
/**
 * 
 * @author vapy
 *
 */
public class MousePadListener1 implements Observer {
	@Override
	public void update() {
		System.out.println("i am a mouse pad listener 1, i receive the mouse pad click");
	}
}
