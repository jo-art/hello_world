package com.yedam.api;

import com.yedam.bookApp.Book;

public class StringUtil {
	//1. 성별
	static String getGender(String ssn) {
		String cleanssn=ssn.replace("-","");
		String ccleanssn=cleanssn.trim();
		char sexnum = ccleanssn.charAt(6);
		String gender="";
		if(sexnum%2 !=0) {
			gender+="남";
		}
		else if(sexnum %2 == 0) {
			gender+="여";
		} else 
			gender+="알수 없음";
	
		 return gender;
		
	}//"남" 또는 "여" 변환
	
//	//파일명 복습
//	static String getFileName1(String file) {
//		int pos=0;
//		String filename="";
//		
//		while(true) {
//			int idx=file.indexOf("/",pos);
//			if(idx==-1) {
//				filename=file.substring(pos,file.indexOf("."));
//				break;
//			}
//			pos= idx+1;
//		}
//		return filename;
//	}
	
	static String getFileName2(String file) {
		String fileName="";
		fileName =file.substring(file.lastIndexOf("/")+1,file.indexOf("."));
		return fileName;
	}
	//파일 확정자
	static String getExtName(String file) {
		String fileexname=file.substring(file.indexOf(".")+1);
		
		return fileexname;
	}
}
