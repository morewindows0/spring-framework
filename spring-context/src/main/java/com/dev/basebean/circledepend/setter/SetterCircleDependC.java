package com.dev.basebean.circledepend.setter;

/**
 * @author: developer
 * @date: 2019/4/28 21:53
 * @description: setter循环依赖演示
 */

public class SetterCircleDependC {

	private SetterCircleDependA setterCircleDependA;

	public void setSetterCircleDependA(SetterCircleDependA setterCircleDependA) {
		this.setterCircleDependA = setterCircleDependA;
	}
}
