package com.StaticProxy;

/**
 * 接口实现
 * 目标对象
 * @author luqijia
 *
 */
public class UserDaoImpl implements UserDao{

	@Override
	public void save() {
		System.out.println("数据保存成功");
	}
	
}
