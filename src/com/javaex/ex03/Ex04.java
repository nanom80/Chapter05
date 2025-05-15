package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex04 {

	public static void main(String[] args) throws IOException {

		// 읽기 스트림 준비
        InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
        InputStreamReader isr = new InputStreamReader(in, "MS949");
        BufferedReader br = new BufferedReader(isr);

        System.out.println("--------읽기 스트림 준비 완료--------");

        // 쓰기 스트림 준비
        OutputStream out = new FileOutputStream("C:\\javaStudy\\PhoneDB_copy.txt");
        OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
        BufferedWriter bw = new BufferedWriter(osw);

        System.out.println("--------쓰기 스트림 준비 완료--------");
        
        while (true) {
            String str = br.readLine();

            if (str == null) {
                System.out.println("----------파일 읽기 끝----------");
                break;
            }

            // 파일 내용 복사
            bw.write(str);
            bw.newLine();

            // 데이터 출력
            String[] info = str.split(",");

            String name = info[0];
            String hp = info[1];
            String company = info.length >= 3 ? info[2] : "-";

            System.out.println("이름: " + name);
            System.out.println("핸드폰: " + hp);
            System.out.println("회사: " + company);
            System.out.println();
        }
        
        System.out.println();
        String newLine = "황일영,010-3333-5151,비트";
        bw.write(newLine);
        System.out.println("새 데이터 추가 완료");
        System.out.println();
        
        // 스트림 닫기
        bw.close();
        br.close();
        System.out.println("-----------스트림 닫기-----------");
        System.out.println();
        
        
        // 읽기 스트림 준비
        InputStream inCopy = new FileInputStream("C:\\javaStudy\\PhoneDB_copy.txt");
        InputStreamReader isrCopy = new InputStreamReader(inCopy, "MS949");
        BufferedReader brCopy = new BufferedReader(isrCopy);
        
        System.out.println("------읽기 스트림 준비 완료------");
        while (true) {
            String str = brCopy.readLine();

            if (str == null) {
                System.out.println("----------파일 읽기 끝----------");
                break;
            }

            // 데이터 출력
            String[] info = str.split(",");

            String name = info[0];
            String hp = info[1];
            String company = info.length >= 3 ? info[2] : "-";

            System.out.println("이름: " + name);
            System.out.println("핸드폰: " + hp);
            System.out.println("회사: " + company);
            System.out.println();
        }
        
        // 스트림 닫기
        brCopy.close();
        
        System.out.println("프로그램 종료");
    }
}
