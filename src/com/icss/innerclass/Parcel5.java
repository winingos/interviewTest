package com.icss.innerclass;

import com.icss.innerclass.interfaceinner.Destionation;

/**
 * �ֲ��ڲ���
 * ����Ƕ���ڷ����ڵ�
 * ����ʵ�ֽӿڻ��߼̳���
 * @author wining
 */
public class Parcel5 {

	public Destionation destionation(String str){
//		++ʵ�ֽӿ���Ϊ�ˣ����ⲿ�����е��ã��Լ��ڱ���������ʱ���������ս��++
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
