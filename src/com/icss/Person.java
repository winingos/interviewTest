package com.icss;

import java.util.Comparator;

public class Person implements Comparable{
 private String name;
 private int age;
 private String sex;
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
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}


public Person(String name, int age, String sex) {
	super();
	this.name = name;
	this.age = age;
	this.sex = sex;
}
public String toString() {
	StringBuffer stb = new StringBuffer();
	stb.append("name="+this.name);
	stb.append(";age="+this.age);
	stb.append(";sex="+this.sex);
	return stb.toString();
}
public int hashCode(){
	return name.hashCode()+sex.hashCode()+age*42;
} 
public boolean equals(Object obj){
	if (! (obj instanceof Person)) {
		return false;
	}
	Person p= (Person)obj;
	if (age==p.getAge()&&name.equals(p.getName())&&sex.equals(p.getSex())) {
		return true;
	}
	return false;
}
@Override
public int compareTo(Object o) {
	Person p1  = (Person)o; 
	if(p1.getAge()>age) 
		return 1; 
	else if (p1.getAge()<age) return -1;
	
		return 0;
}
}

