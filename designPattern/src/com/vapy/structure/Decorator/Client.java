package com.vapy.structure.Decorator;

/**
 *
 * @author vapy 2016年10月8日
 * 
 * 客户端
 *
 */

public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Component component2 = new ConcreteDecorator1(component);
		component2.doSomething();
		
		System.out.println("------------");
		
		Component component3 = new ConcreteDecorator2(component2);
		component3.doSomething();
		
		System.out.println("------------");
		
		Component component1 = new ConcreteDecorator1(new ConcreteDecorator2(
				new ConcreteComponent()));
		component1.doSomething();
	}
}