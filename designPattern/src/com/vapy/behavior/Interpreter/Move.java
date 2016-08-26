package com.vapy.behavior.Interpreter;
/**
 * @author vapy 2016年8月26日
 * 
 * 终结符表达式
 */
public class Move extends AbstractExpression {
	public Move() {
	}
	
	@Override
	public String interpret(String distance) {
		if(distance.matches("[0-9]*")){
			return "move " + distance + " meters ";
		}
		return "";		//如果不是数据，移动距离算0
	}
}