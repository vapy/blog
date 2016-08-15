package com.vapy.behavior.ChainOfResponsibility;

/**
 * 
 * @author vapy
 * 
 */
public class OrdinaryUser extends Handler
{
	@Override
	protected Level getHandlerLevel()
	{
		return new Level("READ");
	}

	@Override
	public void response(Request request)
	{
		System.out.println("我是普通用户，由我便可执行READ操作");
	}
}