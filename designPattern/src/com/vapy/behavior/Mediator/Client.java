package com.vapy.behavior.Mediator;
/**
 * 
 * @author vapy
 *
 */
public class Client {
	public static void main(String[] args) {
		Colleage m = new Monitor("monitor");
		Colleage a = new StudentA("studentA");
		Colleage b = new StudentB("studentB");
		Mediator weChat = new WeChat();
		weChat.add(m);
		weChat.add(a);
		weChat.add(b);
		m.setContext("group chat!");
		weChat.groupChat(m);
System.out.println("-----------------------------");
		a.setContext("private chat");
		weChat.chat(a, b);
	}
}
