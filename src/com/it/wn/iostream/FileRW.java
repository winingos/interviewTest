package com.it.wn.iostream;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.Future;

import javax.imageio.stream.FileImageInputStream;

import org.junit.Test;

public class FileRW {
	@Test
	public void fileW() throws IOException {
		FileWriter fw = new FileWriter("c:\\demo.txt",true);
		fw.write("abcdec");
		fw.flush();
		fw.write("kkkk");
		fw.close();
	}
	@Test
	public void fileRb() {
		FileReader fr = null;
		try {
			fr = new FileReader("c:/demo.txt");
			
			int ch;
			do {
				ch=fr.read();
				System.out.println((char)ch);
			}while(ch!=-1);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	@Test
	public void fileR() {
		FileReader fr = null;
		try {
			fr = new FileReader("c:/demo.txt");
			char[] buf = new char[1024];// 该长度通常都是 1024 的整数倍。
			int len = 0;
			while ((len = fr.read(buf)) != -1) {
				System.out.println(new String(buf, 0, len));
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			if (fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					System.out.println("close:" + e.toString());
				}
		}
	}
/**
 * 使用bufferReader 进行文件copy
 * @throws IOException
 */
	@Test
	public void copyTest() throws IOException {
		BufferedReader bufr = new BufferedReader(new FileReader("c:/demo.txt"));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("c:/demob.txt"));
		String line = null;
		while ((line = bufr.readLine()) != null) {
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
		bufr.close();
	}
	@Test
	public void test() throws IOException {
		MyBufferedReader myBufr = new MyBufferedReader(new FileReader("c:/demob.txt"));
		String line = null;
		while ((line = myBufr.myReadLine()) != null) {
			System.out.println(line);
		}
	}
	@Test
	public void testR() throws IOException {
		MyLineNumberReader myBufr = new MyLineNumberReader(new FileReader("c:/demo.txt"));
		String line = null;
		while ((line = myBufr.myReadLine()) != null) {
			//myBufr.setNumber(0);
			System.out.println(myBufr.getNumber()+":"+line);
		}
	}
	/**
	 * 将键盘录入的数据存储到一个文件中
	 * @throws IOException
	 * 在java中 输入回车时默认结束本次输入；
	 */
	@Test
	public void test1() throws IOException{
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("c:/b.txt"));
		
		String str = bufr.readLine();
		System.out.println(str);
		bufw.write(str);
		bufw.flush();
		bufr.close();
		bufw.close();
	}
	@Test
	public  void test2() throws IOException{
		BufferedWriter bufw = new BufferedWriter(new FileWriter("c:/a.txt"));
		Scanner scanner = new Scanner(System.in);
		//System.out.println(scanner.next());
		bufw.newLine();//换行
		bufw.write(scanner.next().toString());
		bufw.flush();
		bufw.close();
	}
	/**
	 * 按照指定的码表写入文本中
	 * @throws IOException 
	 */
	
	@Test
	public void test3() throws IOException {
		FileOutputStream foStream = new FileOutputStream("c:/d.txt");
		OutputStreamWriter fWriter = new OutputStreamWriter(foStream,"utf-8");
		BufferedWriter br = new BufferedWriter(fWriter);
		Scanner scanner = new Scanner(System.in);
		//System.out.println(scanner.next());
		br.newLine();//换行
		br.write(scanner.next().toString());
		br.flush();
		br.close();
	}
	@Test
	public void copyMpeg() throws IOException{
		BufferedInputStream fi = new BufferedInputStream(new FileInputStream("c:/demo.txt"));
		BufferedOutputStream fo = new BufferedOutputStream(new FileOutputStream("d:/demo.txt"));
		int by = 0;
		while ((by = fi.read())!=-1) {
			fo.write(by);
		}
		fi.close();
		fo.close();
	}
	@Test
	public void readFile() throws IOException{
//		Reader fi = new FileReader("c:/demo.txt");
//		BufferedReader bf = new BufferedReader(fi);
//		String str = "";
//		while ((str=bf.readLine())!=null) {
//			System.out.println(str);
//			
//		}
//		fi.close();
//		bf.close();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:/demob.txt"));
		BufferedOutputStream oup = new BufferedOutputStream(System.out);
		int tmp = 0;
		while ((tmp=bis.read())!=-1) {
			oup.write(tmp);
		}
		bis.close();
		oup.close();
	}
	@Test
	public void copyFile() throws IOException{
		InputStream in =new FileInputStream(new File("d:/srcc.doc"));
		OutputStream out = new FileOutputStream(new File("d:/tar.doc"));
		int temp=0;
		while ((temp=in.read())!=-1) {
			out.write(temp);
		}
	}
	
}

