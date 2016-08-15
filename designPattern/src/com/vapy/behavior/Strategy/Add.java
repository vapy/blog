package com.vapy.behavior.Strategy;
/**
 * 
 * @author vapy
 *
 */
public class Add implements Strategy
{
	@Override
	public int calc(int a, int b)
	{
		return a + b;
	}
}