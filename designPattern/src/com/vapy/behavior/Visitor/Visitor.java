package com.vapy.behavior.Visitor;

/**
 * 
 * @author vapy
 * 
 */
public class Visitor extends IVisitor
{
	@Override
	public void visit(Dancer dancer)
	{
		dancer.doSomething();
	}

	@Override
	public void visit(Singer singer)
	{
		singer.doSomething();
	}
}