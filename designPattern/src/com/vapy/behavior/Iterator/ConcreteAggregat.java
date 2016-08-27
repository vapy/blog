package com.vapy.behavior.Iterator;

import java.util.Vector;
/**
 * 
 * @author vapy 2016年8月27日
 * 
 */
public class ConcreteAggregat implements Aggregat {
	private Vector<Object> vector = null;
	
	public Vector<Object> getVector() {
		return vector;
	}

	public void setVector(Vector<Object> vector) {
		this.vector = vector;
	}
	
	public ConcreteAggregat(){
		vector = new Vector<Object>();
	}
	
	@Override
	public void add(Object obj) {
		vector.add(obj);
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(vector);
	}

}