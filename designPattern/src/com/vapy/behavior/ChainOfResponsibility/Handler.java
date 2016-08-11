package com.vapy.behavior.ChainOfResponsibility;

/**
 * 
 * @author vapy
 * 
 */
public abstract class Handler
{
	private Handler nextHandler;
	
	public final void handleRequese(Request request) {
		if(this.getHandlerLevel().above(request.getLevel())) {
			this.response(request);
		} else {
			if(this.nextHandler != null) {
				this.nextHandler.handleRequese(request);
			} else {
				System.out.println("没有合适处理器");
			}
		}
	}
	
	public void setNextHandler(Handler handler) {
		this.nextHandler = handler;
	}
	
	protected abstract Level getHandlerLevel();
	
	public abstract void response(Request request);
}