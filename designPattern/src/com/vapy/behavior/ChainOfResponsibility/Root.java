package com.vapy.behavior.ChainOfResponsibility;

/**
 * 
 * @author vapy
 * 
 */
public class Root extends Handler
{
	@Override
	protected Level getHandlerLevel()
	{
		return new Level("DELETE");
	}

	@Override
	public void response(Request request)
	{
		System.out.println("我是ROOT，只有我可以执行DELETE操作");
	}
}