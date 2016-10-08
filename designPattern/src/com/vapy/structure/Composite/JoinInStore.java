package com.vapy.structure.Composite;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author vapy 2016年10月8日
 * 
 * 树叶构件角色
 *
 */

public class JoinInStore extends StoreFront {
	public JoinInStore() {
		
	}
	
	public JoinInStore(String storeName) {
		this.storeName = storeName;
	}
	
	@Override
	public void add(StoreFront store) {
		throw new NotImplementedException();
	}

	@Override
	public void remove(StoreFront store) {
		throw new NotImplementedException();
	}

	@Override
	public void payByCard() {
		System.out.println(storeName + "店的积分已累加进该会员卡");
	}
}