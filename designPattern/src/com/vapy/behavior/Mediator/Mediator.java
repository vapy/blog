package com.vapy.behavior.Mediator;
/**
 * 
 */
import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
	List<Colleage> list = new ArrayList<Colleage>();
	
	public void add(Colleage colleage) {
		list.add(colleage);
	}
	public abstract void groupChat(Colleage col);
	public abstract void chat(Colleage col1, Colleage col2);
}
