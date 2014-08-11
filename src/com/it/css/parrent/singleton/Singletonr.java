package com.it.css.parrent.singleton;
/*
 *私有的构造方法
 *指向自己实例的私有静态引用
 *以自己实例为返回值的静态的公有的方法
 *饿汉式单例在单例类被加载时候，就实例化一个对象交给自己的引用rich
 */
public class Singletonr {
	
	private static Singletonr instance=new Singletonr();
	private Singletonr() {}
	public static Singletonr getInstance() {
		return instance;
	}

}
