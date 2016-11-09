package com.vapy.structure.flyweght;

/**
 * 
 * @author vapy 2016年11月9日
 *
 */

public class ConcreteFlyweight extends Flyweight {
	public ConcreteFlyweight(String _extrinsic) {
		super(_extrinsic);
	}

	@Override
	public void operate() {
		// 业务逻辑
	}
}