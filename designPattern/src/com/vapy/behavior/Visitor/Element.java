package com.vapy.behavior.Visitor;

/**
 * 
 * @author vapy
 * 
 */
public abstract class Element
{
	public abstract void accept(IVisitor visitor);
	public abstract void doSomething();
}