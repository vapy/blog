package com.vapy.behavior.Memento.white;
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
	
	//创建备忘录对象
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	//恢复状态
	public void setMemento(Memento memento){
		this.state = memento.getState();
	}
}