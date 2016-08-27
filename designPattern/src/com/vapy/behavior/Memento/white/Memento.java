package com.vapy.behavior.Memento.white;
/**
*
* @author vapy 2016年8月27日
* 
* 备忘录
*
*/
public class Memento {
	//保存的状态
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