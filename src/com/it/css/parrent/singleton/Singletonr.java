package com.it.css.parrent.singleton;
/*
 *˽�еĹ��췽��
 *ָ���Լ�ʵ����˽�о�̬����
 *���Լ�ʵ��Ϊ����ֵ�ľ�̬�Ĺ��еķ���
 *����ʽ�����ڵ����౻����ʱ�򣬾�ʵ����һ�����󽻸��Լ�������rich
 */
public class Singletonr {
	
	private static Singletonr instance=new Singletonr();
	private Singletonr() {}
	public static Singletonr getInstance() {
		return instance;
	}

}
