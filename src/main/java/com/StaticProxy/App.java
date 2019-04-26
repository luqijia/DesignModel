package com.StaticProxy;

public class App {
	public static void main(String[] args) {
		
		//目标对象
		UserDaoImpl userDao = new UserDaoImpl();
		
		//代理对象，把目标对象传给代理对象，建立代理关系
		UserDaoProxy proxy = new UserDaoProxy(userDao);
		
		//执行的是代理的方法
		proxy.save();
	}
}
