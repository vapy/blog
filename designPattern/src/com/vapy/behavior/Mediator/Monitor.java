package com.vapy.behavior.Mediator;
/**
 * 
 * @author vapy
 *
 */
public class Monitor extends Colleage {
	public Monitor(String name) {
		super(name);
	}

	@Override
	public void send() {
		System.out.println("monitor say \"" + this.getContext() + "\"");
	}
}
