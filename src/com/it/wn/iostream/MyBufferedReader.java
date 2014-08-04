package com.it.wn.iostream;

import java.io.IOException;
import java.io.Reader;

class MyBufferedReader {
	private Reader r;

	MyBufferedReader(Reader r) {
		this.r = r;
	}

	public String myReadLine() throws IOException {
		// 1,创建临时容器。
		StringBuilder sb = new StringBuilder();
		// 2,循环的使用 read 方法不断读取字符。
		int ch = 0;
		while ((ch = r.read()) != -1) {
			if (ch == '\r')
				continue;
			if (ch == '\n')
				return sb.toString();
			else
				sb.append((char) ch);
		}
		if (sb.length() != 0)
			return sb.toString();
		return null;
	}

	public void myClose() throws IOException {
		r.close();
	}

	
}
