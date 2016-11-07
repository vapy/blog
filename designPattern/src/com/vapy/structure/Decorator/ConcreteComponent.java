package com.vapy.structure.Decorator;

/**
 *
 * @author vapy 2016年10月10日
 * 
 * 具体构件角色
 *
 */

public class ConcreteComponent implements Component
{
	@Override
	public void doSomething()
	{
		System.out.println("操作A");
	}

}