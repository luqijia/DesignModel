package com.DynamicProxy;

/**
 * 目标对象,需要实现接口
 * @author luqijia
 *
 */
public class UserDaoImpl implements UserDao{

	@Override
	public void save() {
		System.out.println("数据保存成功");
	}

}
