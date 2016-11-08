package com.vapy.structure.Facade;

/**
 * 
 * @author vapy 2016年11月8日
 * 
 */

public class Facade {
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	Context context = new Context();

	public void methodA() {
		this.a.doSomethingA();
	}

	public void methodB() {
		this.b.doSomethingB();
	}

	public void methodC() {
		this.context.complexMethod();
	}
}