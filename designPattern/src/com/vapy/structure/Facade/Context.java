package com.vapy.structure.Facade;

/**
 * 
 * @author vapy 2016年11月8日
 *
 */

public class Context {
	private ClassA a = new ClassA();
	private ClassC c = new ClassC();
	
	public void complexMethod() {
		this.a.doSomethingA();
		this.c.doSomethingC();
	}
}