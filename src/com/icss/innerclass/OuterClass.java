package com.icss.innerclass;

/**
 * �ں���Ա�ڲ���
 * ��Ա�ڲ���Ҳ������ͨ���ڲ��࣬������Χ���һ����Ա��
 * �������ǿ��������Ƶķ�����Χ������� ��Ա���Ժͷ�����������private�ģ�
 * ������Χ��Ҫ�����ڲ���ĳ�Ա���Ժͷ�������Ҫͨ���ڲ���ʵ��������
 * @author wining
 *
 */
public class OuterClass {
  private String name;
  private int age;
  private String str;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void outdisplay(){
    System.out.println("OuterClass...");
}
/*�Ƽ�ʹ��getxxx()����ȡ��Ա�ڲ��࣬�����Ǹ��ڲ���Ĺ��캯���޲���ʱ*/
public InnerClass getInnerClass(){
	return new InnerClass();
}

//�ڲ���
/**
 * ��Ա�ڲ���
 * @author Administrator
 *
 */
	class InnerClass{
		public InnerClass(){
			name="Jreey";
			age=30;
		}
		public void display(){
			System.out.println("name:"+name+"\nage:"+age);
		}
		public OuterClass getOuterClass(){
	        return OuterClass.this;
	    }
		public void innerdisplay() {
			  //ʹ����Χ�ڵ�����
            str = "chenssy...";
            System.out.println(str);
            //ʹ����Χ�ڵķ���
            outdisplay();

		}

	}
	/**
	 *  �����ڲ�����û�з������η���
	 *  new �����ڲ��࣬�����������Ҫ���ڵ�
	 * @param num
	 * @param str2
	 * @return
	 */
	public InnerClazz getInnerClazz(final int num,String str2){
        return new InnerClazz(){
            int number = num + 3;
            public int getNumber(){
                return number;
            }
        };        /* ע�⣺�ֺŲ���ʡ */
    }
	interface InnerClazz{
		public int getNumber();
	}
	public static void  main(String[] agrv) {
		 OuterClass out1 = new OuterClass();
	     InnerClazz inner = out1.getInnerClazz(2, "chenssy");
	        System.out.println(inner.getNumber());
	}
}

