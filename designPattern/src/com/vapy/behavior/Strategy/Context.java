package com.vapy.behavior.Strategy;
/**
 * 
 * @author vapy
 *
 */
public class Context
{
	private Strategy strategy;

	public Context(){}
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public Strategy getStrategy()
	{
		return strategy;
	}

	public void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;
	}
	
	public int calc(int a, int b){
		return this.strategy.calc(a, b);
	}
}