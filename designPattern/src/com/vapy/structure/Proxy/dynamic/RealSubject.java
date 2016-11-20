package com.vapy.structure.Proxy.dynamic;

/**
 * 
 * @author vapy 2016年11月12日
 *
 */

public class RealSubject implements Subject {
	@Override
	public void request() {
		System.out.println("RealSubject request");
	}
}