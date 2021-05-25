package com.kh.java._interface;

public class InterfaceTest {

	public static void main(String[] args) {
		InterfaceTest it = new InterfaceTest();
		it.test1();
	}

	/**
	 * 추상클래스
	 * - 추상메소드를 통한 자식클래스의 구현강제화
	 * - 일반클래스 -> 필드, 메소드 사용가능
	 * 
	 * 인터페이스
	 * - 추상메소드를 통한 자식클래스의 구현강제화
	 * - 일반클래스 아님 -> 상수, 일반메소드는 사용불가(1.7)
	 * - default, static 메소드 사용가능(1.8)
	 * 
	 */
	
	private void test1() {
		Foo foo = new FooImpl();
		foo.run();
		System.out.println(Foo.STRICT_MODE);
		foo.say();
		Foo.print("홍길동");
	}
	
	
	
}
