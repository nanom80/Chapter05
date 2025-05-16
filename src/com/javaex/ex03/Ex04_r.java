package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex04_r {

	public static void main(String[] args) throws IOException {
		
		//리스트 만들기
		List<Person> pList = new ArrayList<Person>();
		
		//스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB_tmp.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] sArr = str.split(",");
			
			String name = sArr[0];
			String hp = sArr[1];
			String company = sArr[2];
			
			//Person을 메모리에 올린다
			Person p = new Person(name, hp, company);
			
			//Person(주소)를 List에 추가한다
			pList.add(p);
			
		}
		
		//테스트출력
		System.out.println(pList.toString());
		
		System.out.println("-------------------------------------------------");
		
		//출력
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("-------------------------------------------------");
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).getName());
			System.out.println(pList.get(i).getHp());
			System.out.println(pList.get(i).getCompany());
			System.out.println("----------------");
		}
		
		br.close();
		
	}
}
