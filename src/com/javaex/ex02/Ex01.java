package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		//주 스트림 준비
		Writer fw = new FileWriter("C:\\javaStudy\\song.txt");
		
		//보조 스트림 준비
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교종이 땡땡땡");
		bw.newLine();
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		
		
		//스트림 종료
		bw.close();
		
	}
}
