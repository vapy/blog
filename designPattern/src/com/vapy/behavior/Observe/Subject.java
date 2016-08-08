package com.vapy.behavior.Observe;

import java.util.Vector;
/**
 * 
 * @author vapy
 *
 */
public abstract class Subject {
	private Vector<Observer> obs = new Vector<Observer>();
	
	public void addObserver(Observer observer) {
		this.obs.add(observer);
	}
	
	public void delObserver(Observer observer) {
		this.obs.remove(observer);
	}
	
	protected void notifyObservers() {
		for(Observer o : obs) {
			o.update();
		}
	}
	
	public abstract void click();
}