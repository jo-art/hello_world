package com.yedam.io;

import java.io.File;
import java.io.FileWriter;

public class FileExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:/temp/new.txt");// 파일 생성자 호출, 파일의 정보를 들고옴
		File file1 = new File("c:/temp/images/img1/new"); //디렉토리 
		try {
			if(!file.exists()) { //파일 존재여부 , 파일이 없으면
				file.createNewFile();//파일 생성
				System.out.println("파일 생성됨.");
			}
			if(!file1.exists()) {
				file1.mkdirs();
				
				System.out.println("폴더생성됨");
			}
			FileWriter fw= new FileWriter(file);
			fw.write("hello\n ");
			fw.write("world \n");
			fw.flush(); fw.close();
			
			if(file.exists()) {
				file.delete();
				System.out.println("deleted");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}

}
