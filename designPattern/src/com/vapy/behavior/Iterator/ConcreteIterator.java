package com.vapy.behavior.Iterator;

import java.util.Vector;
/**
 * 
 * @author vapy 2016年8月27日
 * 
 */
public class ConcreteIterator implements Iterator {
	private int cursor = -1;
	private Vector<Object> vector = null;
	
	public ConcreteIterator(final Vector<Object> vector){
		this.vector = vector;
	}

	@Override
	public Object first() {
		return vector.get(0);
	}

	@Override
	public Object next() {
		cursor ++;
		return vector.get(cursor);
	}

	@Override
	public Object currentItem() {
		return vector.get(cursor);
	}

	@Override
	public boolean isDone() {
		if(cursor >= this.vector.size() - 1){
			return true;
		} else {
			return false;
		}
	}
}