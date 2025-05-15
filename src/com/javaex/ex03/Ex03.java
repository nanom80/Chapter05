package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
        // 읽기 스트림 준비
        InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");  // 주스트림: 2진수 읽기
        InputStreamReader isr = new InputStreamReader(in, "MS949");          // 보조스트림: 문자로 해석
        BufferedReader br = new BufferedReader(isr);                         // 보조스트림: 버퍼링 처리

        System.out.println("--------전화번호부 출력--------");

        while (true) {
        	
            String str = br.readLine();
            
            if (str == null) {
                System.out.println("----------파일 읽기 끝----------");
                break;
            }

            // 쉼표 기준으로 분리
            String[] parts = str.split(",");
            if (parts.length == 3) {
                String name = parts[0];
                String hp = parts[1];
                String company = parts[2];

                System.out.println("이름: " + name);
                System.out.println("핸드폰: " + hp);
                System.out.println("회사: " + company);
                System.out.println();
            } else {
                System.out.println("⚠ 잘못된 형식: " + str);
            }
        }

        // 스트림 닫기
        br.close();
        System.out.println("프로그램 종료");
    }
	
}
