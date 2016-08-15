package com.vapy.behavior.Command;

/**
 * 
 * @author vapy
 * 
 */
public class ConcreteCommand extends Command
{
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void execute() {
		this.receiver.executeCommand();
	}
}