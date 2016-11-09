package com.vapy.structure.flyweght;

/**
 * 
 * @author vapy 2016年11月9日
 *
 */

public abstract class Flyweight {
	// 内部状态
	private String intrinsic;
	// 外部状态
	// 此处为final，即对象创建后外部状态不能改变
	protected final String extrinsic;
	
	public Flyweight(String _extrinsic) {
		this.extrinsic = _extrinsic;
	}

	// 定义业务操作
	public abstract void operate();

	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
}