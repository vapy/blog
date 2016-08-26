package com.vapy.behavior.Interpreter;
/**
 * @author vapy 2016年8月26日
 */

public class Client {
	public static void main(String[] args) {
		String inputExpr = "22 and 23";
		Context context = new Context(inputExpr);
		context.exec();
		System.out.println(context.getOutput());
	}
}