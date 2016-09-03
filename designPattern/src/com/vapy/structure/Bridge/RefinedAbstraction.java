package com.vapy.structure.Bridge;
/**
 *
 * @author vapy 2016年9月3日
 *
 */
public class RefinedAbstraction extends Abstraction {
	@Override
	public void operation() {
		implementor.operation();
	}
}