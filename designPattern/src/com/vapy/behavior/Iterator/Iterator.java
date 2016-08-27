package com.vapy.behavior.Iterator;
/**
 * 
 * @author vapy 2016年8月27日
 * 
 */
public interface Iterator {
	public Object next();
	public Object currentItem();
	public boolean isDone();
	public Object first();
}