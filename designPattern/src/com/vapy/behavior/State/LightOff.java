package com.vapy.behavior.State;
/**
 * 
 * @author vapy
 *
 */
public class LightOff extends LightState
{
	@Override
	public void press(Light light)
	{
		System.out.println("turn on the light");
		light.setState(new LightOn());
	}
}