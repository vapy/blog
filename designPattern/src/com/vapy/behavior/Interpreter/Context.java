package com.vapy.behavior.Interpreter;
/**
 * @author vapy 2016年8月26日
 * 
 * 上下文
 */
public class Context {
	private String input;
	private String output = "";

	public Context(String input) {
		this.input = input;
	}
	
	public void exec() {
		AbstractExpression move = new Move();
		AbstractExpression and = new And();
		String[] in = input.split(" ");
		for(String str : in) {
			if(str.equalsIgnoreCase("and")) {
				output += and.interpret(str);
			} else {
				output += move.interpret(str);
			}
		}
	}
	
	public String getOutput() {
		return output;
	}
}