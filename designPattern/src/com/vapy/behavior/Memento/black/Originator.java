package com.vapy.behavior.Memento.black;
/**
*
* @author vapy 2016年8月27日
* 
* 发起人
*
*/
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public IMemento createMemento(){
		return new Memento(this.state);
	}
	
	public void setMemento(IMemento memento){
		this.state = ((Memento)memento).getState();
	}
}