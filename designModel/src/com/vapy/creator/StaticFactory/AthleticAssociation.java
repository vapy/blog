package com.vapy.creator.StaticFactory;

/**
 * 
 * @author vapy
 * 
 * 运动员协会
 *
 */
public class AthleticAssociation {
	public static Athlete registeredFootballPlayer() {
		return new FootballPlayer();
	}
}
