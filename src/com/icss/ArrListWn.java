package com.icss;

import java.sql.Array;
import java.util.Arrays;

public class ArrListWn<T> {
	private Object[] objs;
	private int size=0;

	public ArrListWn(T[] ts) {
		super();
		this.objs = Arrays.copyOf(ts, ts.length);
		size = ts.length;
	}

	public ArrListWn(int i) {
		super();
		objs = new Object[i];
	}
	public ArrListWn() {
		this(10);
	}

	public void putw( Integer index,Object o){
		size++;
		objs[index]=o;
	}
	public<E> Object getw(int index){
		return objs[index];
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public void revome(int index){
		System.arraycopy(objs, index+1, objs, index, size-index+1);
		size --;
	}
	public void clear(){
		size=0;
		objs= new Object[]{};
	}
	public String toString(){
		StringBuffer stb =new StringBuffer();
		for (int i = 0; i < size(); i++) {
			stb.append(this.getw(i).toString());
		}
		return stb.toString();
	}
}
