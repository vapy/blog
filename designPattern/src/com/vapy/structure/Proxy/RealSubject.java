package com.vapy.structure.Proxy;

/**
 * 
 * @author vapy 2016年11月12日
 *
 */

public class RealSubject extends Subject {
	@Override
	public void request() {
		System.out.println("RealSubject request");
	}
}