package com.vapy.behavior.Iterator;
/**
 * 
 * @author vapy 2016年8月27日
 * 
 */
public class Client {
	public static void main(String[] args) {
		final Aggregat agg = new ConcreteAggregat();
		agg.add("first element");
		agg.add("second element");
		final Iterator iterator = agg.createIterator();
		System.out.println(iterator.first());
		while(!iterator.isDone()){
			System.out.println(iterator.next());
		}
	}
}