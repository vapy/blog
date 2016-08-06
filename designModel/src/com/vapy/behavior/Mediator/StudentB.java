package com.vapy.behavior.Mediator;
/**
 * 
 * @author vapy
 *
 */
public class StudentB extends Colleage {
	public StudentB(String name) {
		super(name);
	}

	@Override
	public void send() {
		System.out.println("studentB say \"" + this.getContext() + "\"");
	}
}
