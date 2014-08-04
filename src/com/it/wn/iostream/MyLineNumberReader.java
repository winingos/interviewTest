package com.it.wn.iostream;

import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader  extends MyBufferedReader {

	private int number;
	MyLineNumberReader(Reader r)
	{
	super(r);
	}
	public String myReadLine() throws IOException
	{
	number++;
	return super.myReadLine();
	}
	public void setNumber(int number)
	{
	this.number = number;
	}
	public int getNumber()
	{
	return number;
	}

}
