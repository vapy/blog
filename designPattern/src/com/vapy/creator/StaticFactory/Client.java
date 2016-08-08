package com.vapy.creator.StaticFactory;

/**
 * 
 * @author vapy
 * 
 * 不属于23种gof设计模式之一
 *
 */
public class Client {
	private static Athlete goalkeeper;
	private static Athlete guard;

	public static void main(String[] args) {
		guard = AthleticAssociation.registeredFootballPlayer();
		goalkeeper = AthleticAssociation.registeredFootballPlayer();
		goalkeeper.run();
		guard.jump();
	}
}
