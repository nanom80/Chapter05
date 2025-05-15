package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		//주 스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\bufferedimg.jpg");
		
		//보조 스트림
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("스트림준비완료");
		
		System.out.println("복사시작");
		while(true) {
			int data = bin.read();
			//-1이면 끝
			if(data == -1) {
				System.out.println("복사끝");
				break;
			}
			
			bout.write(data);
			
		}
		
		//스트림 정리(보조스트림을 종료시키면 주 스트림도 함께 종료)
		bout.close();
		bin.close();
		
		System.out.println("프로그램 종료");
		
	}
}
