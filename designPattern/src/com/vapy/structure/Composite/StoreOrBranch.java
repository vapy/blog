package com.vapy.structure.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author vapy 2016年10月8日
 * 
 * 树枝构件角色
 * 
 */

public class StoreOrBranch extends StoreFront {
	public StoreOrBranch() {

	}

	public StoreOrBranch(String storeName) {
		this.storeName = storeName;
	}
	
	List<StoreFront> myStoreList = new ArrayList<StoreFront>();

	@Override
	public void add(StoreFront store) {
		myStoreList.add(store);
	}

	@Override
	public void remove(StoreFront store) {
		myStoreList.remove(store);
	}

	@Override
	public void payByCard() {
		System.out.println(storeName + "店的积分已累加进该会员卡");
		for(StoreFront sf : myStoreList) {
			sf.payByCard();
		}
	}
}