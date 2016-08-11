package com.vapy.behavior.ChainOfResponsibility;

/**
 * 
 * @author vapy
 * 
 */
public class Client
{
	public static void main(String[] args)
	{
		Handler handler1 = new OrdinaryUser();
		Handler handler2 = new Administrators();
		Handler handler3 = new Root();
		
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		
		handler1.handleRequese(new Request(new Level("read")));
		handler1.handleRequese(new Request(new Level("change")));
		handler1.handleRequese(new Request(new Level("DELETE")));
	}
}