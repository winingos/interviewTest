package com.icss.innerclass;

public class ExecuaTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		OuterClass out=new OuterClass();
//		����������ڲ��ࣺ�����ڲ���������Ҫָ��������������
		OuterClass.InnerClass inner=out.new InnerClass();
//		���ǿ��Կ����ڲ���InnerClass���Զ���Χ��OuterClass�����Խ����޷�ķ���
		inner.display();
		inner.getOuterClass().outdisplay();
		
		

	}
	
}
