package com.it.css.parrent.singleton;
/*
 * 私有的构造方法
 *指向自己实例的私有静态引用
 *以自己实例为返回值的静态的公有的方法
 *懒汉式在调用取得实例方法的时候才会实例化对象lazy
 */
public class Singletonl {
	
	private static Singletonl instance=new Singletonl();
	private Singletonl() {}
	public static Singletonl getInstance() {
		if (instance==null) {
			instance=new Singletonl();
		}
		return instance;
	}

}
