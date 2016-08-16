package com.vapy.behavior.State;
/**
 * 
 * @author vapy
 *
 */
public class Light
{
	private LightState state;
	
	public Light(LightState state) {
		this.state = state;
	}
	
	public void changeState() {
		state.press(this);
	}

	public LightState getState()
	{
		return state;
	}

	public void setState(LightState state)
	{
		this.state = state;
	}
	
}