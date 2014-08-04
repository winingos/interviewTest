package com.icss.innerclass;

/**
 * 内含成员内部类
 * 成员内部类也是最普通的内部类，它是外围类的一个成员，
 * 所以他是可以无限制的访问外围类的所有 成员属性和方法，尽管是private的，
 * 但是外围类要访问内部类的成员属性和方法则需要通过内部类实例来访问
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
/*推荐使用getxxx()来获取成员内部类，尤其是该内部类的构造函数无参数时*/
public InnerClass getInnerClass(){
	return new InnerClass();
}

//内部类
/**
 * 成员内部类
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
			  //使用外围内的属性
            str = "chenssy...";
            System.out.println(str);
            //使用外围内的方法
            outdisplay();

		}

	}
	/**
	 *  匿名内部类是没有访问修饰符的
	 *  new 匿名内部类，这个类首先是要存在的
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
        };        /* 注意：分号不能省 */
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

