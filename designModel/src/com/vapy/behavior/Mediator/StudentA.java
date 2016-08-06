package com.vapy.behavior.Mediator;
/**
 * 
 * @author vapy
 *
 */
public class StudentA extends Colleage {
	public StudentA(String name) {
		super(name);
	}

	@Override
	public void send() {
		System.out.println("studentA say \"" + this.getContext() + "\"");
	}
}
