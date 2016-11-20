package com.vapy.structure.Proxy;

/**
 * 
 * @author vapy 2016年11月12日
 *
 */

public class Proxy {
	// 对真实角色的引用
	private RealSubject real;

	public void request() {
		// 真实角色操作前的附加操作
		this.preRequest();
		if(null == real) {
			real = new RealSubject();
		}
		real.request();
		// 真实角色操作后的附加操作
		this.postRequest();
	}

	public void preRequest() {
		System.out.println("pre request");
	}

	public void postRequest() {
		System.out.println("post request");
	}
}