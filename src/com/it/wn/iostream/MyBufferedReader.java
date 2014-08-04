package com.it.wn.iostream;

import java.io.IOException;
import java.io.Reader;

class MyBufferedReader {
	private Reader r;

	MyBufferedReader(Reader r) {
		this.r = r;
	}

	public String myReadLine() throws IOException {
		// 1,������ʱ������
		StringBuilder sb = new StringBuilder();
		// 2,ѭ����ʹ�� read �������϶�ȡ�ַ���
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
