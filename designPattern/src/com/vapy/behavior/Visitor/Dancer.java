package com.vapy.behavior.Visitor;

/**
 * 
 * @author vapy
 * 
 */
public class Dancer extends Element
{
	@Override
	public void accept(IVisitor visitor)
	{
		visitor.visit(this);
	}

	@Override
	public void doSomething()
	{
		System.out.println("dance");
	}
}