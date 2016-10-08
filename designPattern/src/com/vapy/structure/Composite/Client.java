package com.vapy.structure.Composite;

/**
 *
 * @author vapy 2016年10月8日
 * 
 * 客户角色
 *
 */

public class Client {
	public static void main(String[] args) {
		StoreOrBranch store = new StoreOrBranch("朝阳总店");
        StoreOrBranch brach = new StoreOrBranch("东城分店");
        JoinInStore jstore1 = new JoinInStore("东城加盟店一");
        JoinInStore jstore2 = new JoinInStore("东城加盟店二");

        brach.add(jstore1);
        brach.add(jstore2);
        store.add(brach);
        store.payByCard();
	}
}