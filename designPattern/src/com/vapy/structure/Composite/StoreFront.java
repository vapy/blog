package com.vapy.structure.Composite;

/**
 *
 * @author vapy 2016年10月8日
 * 
 * 抽象构件角色
 *
 */

public abstract class StoreFront {
	protected String storeName;
	
	public String getStoreName() {
		return storeName;
	}
	
	public abstract void add(StoreFront store);
	
	public abstract void remove(StoreFront store);
	
	// 刷卡
	public abstract void payByCard();
}