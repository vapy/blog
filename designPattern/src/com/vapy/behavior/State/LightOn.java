package com.vapy.behavior.State;
/**
 * 
 * @author vapy
 *
 */
public class LightOn extends LightState
{
	@Override
	public void press(Light light)
	{
		System.out.println("turn off the light");
		light.setState(new LightOff());
	}
}