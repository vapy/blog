package com.vapy.behavior.ChainOfResponsibility;

/**
 * 
 * @author vapy
 * 
 */
public class Request
{
	Level level;
	
	public Request(Level level) {
		this.level = level;
	}
	
	public Level getLevel() {
		return level;
	}
}