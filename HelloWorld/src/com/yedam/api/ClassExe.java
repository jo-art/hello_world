package com.yedam.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.yedam.bookApp.Book;

public class ClassExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	try {
		Class cls = Class.forName("com.yedam.bookApp.Book");
		Method[] methods=cls.getDeclaredMethods();
		for(int i=0; i<methods.length;i++) {
			System.out.println(methods[i].getName());
		}
		System.out.println("=================");
		Field[] fary =cls.getDeclaredFields(); //생성자
		for(int i=0; i<fary.length;i++) {
			System.out.println(fary[i].getName());
		}
		System.out.println("=================");
		Constructor[] fcon =cls.getDeclaredConstructors();
		for(int i=0;i<fcon.length;i++) {
			System.out.println(fcon[i].getModifiers());
		}
	}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
