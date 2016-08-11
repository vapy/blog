package com.vapy.behavior.ChainOfResponsibility;

/**
 * 
 * @author vapy
 * 
 */
public class Level
{
	private int level = 0;

	public enum UserRights
	{
		READ(1), ADD(2), CHANGE(2), UPDATE(2), DELETE(3);
		private int code;

		private UserRights(int code)
		{
			this.code = code;
		}

		public int getCode()
		{
			return code;
		}
	}

	public Level(String str)
	{
		for (UserRights s : UserRights.values())
		{
			if (str.equalsIgnoreCase(s.name()))
			{
				this.level = s.getCode();
			}
		}
		if (level == 0)
		{
			level = Integer.MAX_VALUE;
		}
	}

	public boolean above(Level level)
	{
		if (this.level >= level.level)
		{
			return true;
		}
		return false;
	}
}