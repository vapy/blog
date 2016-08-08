package com.vapy.creator.Builder;
/**
 * 
 * @author vapy
 *
 */
public class ConcreteBuilder extends Builder {
	private Car car = new Car();
	
	@Override
	public void setPart(String arg1, String arg2) {
		car.setName(arg1);
		car.setType(arg2);
	}

	@Override
	public Car getCar() {
		return car;
	}
}
