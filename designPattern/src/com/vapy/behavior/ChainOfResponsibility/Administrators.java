package com.vapy.behavior.ChainOfResponsibility;

/**
 * 
 * @author vapy
 * 
 */
public class Administrators extends Handler
{
	@Override
	protected Level getHandlerLevel()
	{
		//ADD, CHANGE, UPDATE得到的level.level均为2，所以此处传参数ADD即可
		return new Level("ADD");
	}

	@Override
	public void response(Request request)
	{
		System.out.println("我是管理员，由我便可执行ADD、CHANGE、UPDATE操作");
	}
}