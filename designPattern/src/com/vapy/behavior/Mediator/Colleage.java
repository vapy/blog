package com.vapy.behavior.Mediator;
/**
 * 
 * @author vapy
 *
 */
public abstract class Colleage {
	private String name;
	private String context;
	
	public Colleage(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public abstract void send();
	public void receive(String str) {
		System.out.println(this.getName() + " receive \"" + str + "\"");
	}
}
