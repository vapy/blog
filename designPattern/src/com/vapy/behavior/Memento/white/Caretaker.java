package com.vapy.behavior.Memento.white;
/**
*
* @author vapy 2016年8月27日
* 
* 负责人
*
*/
public class Caretaker {
	//备忘录属性
	private Memento memento;
	
	//保存备忘录对象
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
	
	//取回备忘录对象
	public Memento retrieveMemento(){
		return memento;
	}
}