package com.vapy.behavior.Iterator;
/**
 * 
 * @author vapy 2016年8月27日
 * 
 */
public interface Aggregat {
	public Iterator createIterator();
	public void add(Object obj);
}