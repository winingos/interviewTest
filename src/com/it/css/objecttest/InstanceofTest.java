package com.it.css.objecttest;

import java.io.Serializable;

import com.it.css.map2test4Refl;

public class InstanceofTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object hello="hello";
		System.out.println("�ַ����Ƿ���Object���ʵ��"+(hello instanceof Object));
		System.out.println("�ַ����Ƿ���String���ʵ��"+(hello instanceof String));
		System.out.println("�ַ����Ƿ���Math���ʵ��"+(hello instanceof Math));
		System.out.println("�ַ����Ƿ���Comparable���ʵ��"+(hello instanceof Comparable));
		String str = "hello";
//		String�ࣨ����ʱ���ͣ��Ȳ���math�࣬Ҳ����math��ĸ�������
//		���Ա����޷�ͨ��
//		System.out.println("�ַ����Ƿ���Math���ʵ��"+(str instanceof Math));
//		string ��serializable�������
		System.out.println("�ַ����Ƿ���Serializable���ʵ��"+(str instanceof Serializable));
		String clazz="org.cazyit.lee.gang.Item";
//		���ַ���������traget�Ӵ��滻Ϊreplacement����֧��������ʽ
		String path1=clazz.replace(".", "\\");
		System.out.println(path1);
//		
		String path2=clazz.replaceAll("\\.", "\\\\");
		System.out.println(path2);

	}

}
