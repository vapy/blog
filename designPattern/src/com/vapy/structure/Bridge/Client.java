package com.vapy.structure.Bridge;
/**
 *
 * @author vapy 2016年9月3日
 *
 */
public class Client {
	public static void main(String[] args) {
		Abstraction abstraction = new RefinedAbstraction();
		abstraction.implementor = new ConcreteImplementorA();
		abstraction.operation();
		abstraction.implementor = new ConcreteImplementorB();
		abstraction.operation();
	}
}