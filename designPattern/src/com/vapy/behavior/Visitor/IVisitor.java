package com.vapy.behavior.Visitor;

/**
 * 
 * @author vapy
 * 
 */
public abstract class IVisitor
{
	public abstract void visit(Dancer dancer);
	public abstract void visit(Singer singer);
}