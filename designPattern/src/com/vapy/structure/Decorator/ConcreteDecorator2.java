package com.vapy.structure.Decorator;

/**
 *
 * @author vapy 2016年10月10日
 * 
 * 具体装饰角色
 *
 */

public class ConcreteDecorator2 extends Decorator
{
	public ConcreteDecorator2(Component component)
	{
		super(component);
	}
	
	@Override
	public void doSomething()
	{
		super.doSomething();
		
		this.doAnotherThing();
	}
	
	private void doAnotherThing()
	{
		System.out.println("操作C");
	}
}