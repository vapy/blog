package com.vapy.behavior.Memento.black;
/**
*
* @author vapy 2016年8月27日
* 
* 发起人
*
*/
public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		originator.setState("初始状态");
		
		System.out.println("当前状态：" + originator.getState());
		System.out.println("保存备忘录");
		caretaker.saveMemento(originator.createMemento());
		System.out.println("设置新状态");
		originator.setState("新状态");
		System.out.println("当前状态：" + originator.getState());
		System.out.println("恢复原状态");
		originator.setMemento(caretaker.retrieveMemento());
		System.out.println("当前状态：" + originator.getState());
	}
}