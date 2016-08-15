package com.vapy.behavior.Command;

/**
 * 
 * @author vapy
 * 
 */
public class Invoker
{
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void action() {
		this.command.execute();
	}
}