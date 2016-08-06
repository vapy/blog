package com.vapy.creator.StaticFactory;
/**
 * 
 * @author vapy
 * 
 * 足球运动员
 *
 */
public class FootballPlayer implements Athlete {
	@Override
	public void run() {
		System.out.println("Football player run!");
	}
	@Override
	public void jump() {
		System.out.println("Football player jump!");
	}
}
