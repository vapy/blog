package com.vapy.behavior.Interpreter;
/**
 * @author vapy 2016年8月26日
 * 
 * 非终结符表达式
 */
public class And extends AbstractExpression {
	
	public And() {
	}
	
	@Override
	public String interpret(String and) {
		if(and.equals("and")) {
			return ",and then ";
		}
		return "";
	}
}