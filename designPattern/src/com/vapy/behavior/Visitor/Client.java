package com.vapy.behavior.Visitor;

/**
 * 
 * @author vapy
 * 
 */
import java.util.List;

public class Client
{
	public static void main(String[] args)
	{
		List<Element> list = ObjectStruture.getList();
		IVisitor visitor = new Visitor();
		for(Element e : list) {
			e.accept(visitor);
		}
	}
}