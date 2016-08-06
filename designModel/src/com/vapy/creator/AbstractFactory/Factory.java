package com.vapy.creator.AbstractFactory;
/**
 * 
 * @author vapy
 *
 */
public class Factory implements IFactory {
	@Override
	public IPhone createIPhone() {
		return new Iphone7();
	}

	@Override
	public Samsung createSamsung() {
		return new SamsungS6();
	}
}
