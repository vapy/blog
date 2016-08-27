package com.vapy.behavior.Memento.black;
/**
*
* @author vapy 2016年8月27日
* 
* 发起人
*
*/
public class Memento implements IMemento {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public Memento(String state){
		super();
		this.state = state;
	}
}