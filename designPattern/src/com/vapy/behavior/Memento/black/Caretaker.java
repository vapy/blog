package com.vapy.behavior.Memento.black;
/**
*
* @author vapy 2016年8月27日
* 
* 发起人
*
*/
public class Caretaker {
	private IMemento memento;
	
	public void saveMemento(IMemento memento){
		this.memento = memento;
	}
	
	public IMemento retrieveMemento(){
		return memento;
	}
}