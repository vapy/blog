package com.vapy.behavior.Strategy;
/**
 * 
 * @author vapy
 *
 */
public class Client
{
	public static void main(String[] args)
	{
		Context context = new Context(new Add());
		System.out.println(context.calc(3, 5));
		context.setStrategy(new Sub());
		System.out.println(context.calc(3, 5));
	}
}