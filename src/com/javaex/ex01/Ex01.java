package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		//IO스트림 준비
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteimg.jpg");
		
		System.out.println("스트림준비완료");
		
		while(true) {
			//읽기
			int data = in.read();
			System.out.println(data);
			
			if(data == -1) {
				System.out.println("읽기끝(-1)");
				break;
			}
			
			//쓰기
			out.write(data);
			System.out.println(data);
		}
		
		System.out.println("프로그램 종료");
		
		//IO스트림 종료
		out.close();
		in.close();
		
	}
}
