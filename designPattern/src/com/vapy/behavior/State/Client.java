package com.vapy.behavior.State;
/**
 * 
 * @author vapy
 *
 */
public class Client
{
	public static void main(String[] args)
	{
		LightState light = new LightOn();
		Light context = new Light(light);
		context.changeState();		//关灯
		context.changeState();		//开灯
		context.changeState();		//关灯
		context.changeState();		//开灯
	}
}