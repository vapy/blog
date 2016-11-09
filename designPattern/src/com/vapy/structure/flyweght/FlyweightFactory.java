package com.vapy.structure.flyweght;

import java.util.HashMap;

/**
 * 
 * @author vapy 2016年11月9日
 * 
 */

public class FlyweightFactory {
	// 定义一个容器
	private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

	// 享元工厂
	public static Flyweight getFlyweight(String extrinsic) {
		Flyweight flyweight = null;
		if (pool.containsKey(extrinsic)) {
			flyweight = pool.get(extrinsic);
		} else {
			flyweight = new ConcreteFlyweight(extrinsic);
			pool.put(extrinsic, flyweight);
		}
		return flyweight;
	}
}