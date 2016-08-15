package com.vapy.behavior.Strategy;
/**
 * 
 * @author vapy
 *
 */
public class Sub implements Strategy
{
	@Override
	public int calc(int a, int b)
	{
		return a - b;
	}
}