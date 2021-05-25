package com.kh.java._interface;

public interface Foo {
	//public static final
	String STRICT_MODE = "strict";

	//public abstract
	void run();
	
	//default method : 자식객체에서 자유롭게 사용가능. 추상메소드가 아님
	default void say() {
		System.out.println("helloooooooooooooo!");
	}
	
	static void print(String str) {
		System.out.println(STRICT_MODE + " : " + str);
	}
}
