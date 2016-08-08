package com.vapy.behavior.Observe;
/**
 * 
 * @author vapy
 *
 */
public class MouseListener1 implements Observer {
	@Override
	public void update() {
		System.out.println("i am a mouse listener 1, i receive the mouse click");
	}
}
