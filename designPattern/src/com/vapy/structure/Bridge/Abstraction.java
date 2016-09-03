package com.vapy.structure.Bridge;
/**
 *
 * @author vapy 2016年9月3日
 *
 */
public abstract class Abstraction {
	protected Implementor implementor;
	
	public Implementor getImplementor() {
		return implementor;
	}
	
	abstract public void operation();
}