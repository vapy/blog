package com.vapy.behavior.Visitor;

/**
 * 
 * @author vapy
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class ObjectStruture
{
	public static List<Element> getList()
	{
		List<Element> list = new ArrayList<Element>();
		list.add(new Dancer());
		list.add(new Dancer());
		list.add(new Dancer());
		list.add(new Singer());
		return list;
	}
}