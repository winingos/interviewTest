package com.it.css.parrent.singleton;
/*
 * ˽�еĹ��췽��
 *ָ���Լ�ʵ����˽�о�̬����
 *���Լ�ʵ��Ϊ����ֵ�ľ�̬�Ĺ��еķ���
 *����ʽ�ڵ���ȡ��ʵ��������ʱ��Ż�ʵ��������lazy
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
