package com.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建动态代理对象 动态代理不需要实现接口，但是需要指定接口类型
 * 
 * @author luqijia
 *
 */
public class ProxyFactory {
	// 维护一个目标对象
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance() {
		
		System.out.println("interfaces="+target.getClass().getInterfaces().toString());
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("开始事物...");
						Object object = method.invoke(target, args);
						System.out.println("提交事物...");
						return object;
					}
				});
	}

}
