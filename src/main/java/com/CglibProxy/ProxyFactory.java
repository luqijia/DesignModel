package com.CglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Cglib子类代理工厂 
 * 对UserDaoImpl在内存中动态构建一个子类对象
 * @author luqijia
 *
 */
public class ProxyFactory implements MethodInterceptor {

	// 维护目标对象
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}

	//给目标对象创建一个代理对象
	public Object getProxyInstance() {
		//1.工具类
		Enhancer enhancer = new Enhancer();
		
		//2.设置父类
		enhancer.setSuperclass(target.getClass());
		
		//3.设置回调函数
		enhancer.setCallback(this);
		
		//4.创建子类（代理对象）
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("开始事物...");

		System.out.println("obj="+obj.getClass());
		System.out.println("method="+method);
		System.out.println("proxy="+proxy);
		
		//执行目标对象的方法
		Object object = method.invoke(target, args);
		
		System.out.println("提交事物...");
		
		return object;
	}

}
