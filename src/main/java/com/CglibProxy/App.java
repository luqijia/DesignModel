package com.CglibProxy;

public class App {
	public static void main(String[] args) {
		//目标对象
		UserDaoImpl target = new UserDaoImpl();
		
		//代理对象
		UserDaoImpl proxy = (UserDaoImpl) new ProxyFactory(target).getProxyInstance();
		
		//执行代理对象的方法
		proxy.save();
	}
}
