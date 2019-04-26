package com.StaticProxy;

/**
 * 代理对象，静态代理
 * 静态代理的代理对象跟目标对象都需要实现接口
 * @author luqijia
 *
 */
public class UserDaoProxy implements UserDao{
	
	//接收保存目标对象
	private UserDao target;
	
	public UserDaoProxy(UserDao target) {
		this.target = target;
	}

	@Override
	public void save() {
		System.out.println("开始事物...");
		target.save();
		System.out.println("提交事物...");
	}
}
