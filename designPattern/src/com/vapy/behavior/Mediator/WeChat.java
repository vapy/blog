package com.vapy.behavior.Mediator;
/**
 * 
 * @author vapy
 *
 */
public class WeChat extends Mediator {
	@Override
	public void groupChat(Colleage col) {
		if (list.contains(col)) {
			col.send();
			String str = col.getContext();
			for (Colleage c : list) {
				c.receive(str);
			}
		}
	}

	@Override
	public void chat(Colleage col1, Colleage col2) {
		col1.send();
		col2.receive(col1.getContext());
	}
}
