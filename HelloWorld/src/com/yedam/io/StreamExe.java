package com.yedam.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamExe {
	public static void main(String[] args) {
		//입력+ 출력 =>복사(바이트)
		try {
			InputStream is = new FileInputStream("c:/temp/image.PNG");
			OutputStream os = new FileOutputStream("c:/temp/image3.PNG");
			byte[] buf = new byte[100];
			while(true) {
				int data =is.read(buf); //배열의 크기만큼 한번에 읽고 쓰기.
				if(data == -1) {
					break;
				}
				os.write(buf);
				os.flush();
				
			}
			is.close();
			
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of prog");
	} // end of main

	static void read() {
		// 입력스트림(바이트)
		try {
			InputStream is = new FileInputStream("C:/temp/data.bin");
			while (true) {
				int data = is.read();
				if (data == -1) {
					break;
				}
				System.out.println(data);
			}
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void write() {
		// 출력스트림(바이트)
		try {
			OutputStream os = new FileOutputStream("C:/temp/data.bin");// 데이터 도착지를temp/data.bin로 하는 바이트 기반 파일 출력 스트림 생성
			os.write(10);
			os.write(20);
			os.write(30);
			// 매개변수로 주어지는 int 끝 1byte만 출력 스트림으로 보냄
			os.flush();// 버퍼를 비워줌
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
