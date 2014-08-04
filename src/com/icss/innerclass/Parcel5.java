package com.icss.innerclass;

import com.icss.innerclass.interfaceinner.Destionation;

/**
 * 局部内部类
 * 它是嵌套在方法内的
 * 必须实现接口或者继承类
 * @author wining
 */
public class Parcel5 {

	public Destionation destionation(String str){
//		++实现接口是为了，在外部方法中调用，以及在本方法返回时，接收最终结果++
        class PDestionation implements Destionation{
            private String label;
            private PDestionation(String whereTo){
                label = whereTo;
            }
            public String readLabel(){
                return label;
            }
        }
        return new PDestionation(str);
    }

	public static void main(String[] args) {
		Parcel5 parcel5 = new Parcel5();
        Destionation d = parcel5.destionation("chenssy");
        System.out.println(d.readLabel());
	}

}
