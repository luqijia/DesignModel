package com.CglibProxy;

/**
 * 目标对象，没有实现任何接口
 * @author luqijia
 *
 */
public class UserDaoImpl {
	public void save() {
		System.out.println("数据保存成功");
	}
}
