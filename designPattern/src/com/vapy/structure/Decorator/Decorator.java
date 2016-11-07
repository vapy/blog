package com.vapy.structure.Decorator;

/**
 *
 * @author vapy 2016年10月10日
 * 
 * 装饰角色
 *
 */

public class Decorator implements Component
{
	private Component component;
	
	public Decorator(Component component)
	{
		this.component = component;
	}
	
	@Override
	public void doSomething()
	{
		component.doSomething();
	}
}