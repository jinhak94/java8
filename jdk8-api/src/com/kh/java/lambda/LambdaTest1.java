package com.kh.java.lambda;

import java.util.Date;

/**
 * 함수형 프로그래밍
 * - 객체지향의 메소드
 * - 함수 호출시 암시적인 입력값, 암시적인 결과값의 사용을 자제하고
 *   명시적인 입력값/결과값을 사용하려는 프로그래밍
 * - 함수가 일급값 : 인자로 전달, 리턴값으로 함수를 처리
 */

public class LambdaTest1 {
	private int num = (int) new Date().getTime();
	
	/**
	 * 함수호출시
	 * 1. 명시적/암시적 입력값
	 * 2. 명시적/암시적 결과값
	 * 
	 * @param n
	 * @return 
	 * 
	 */
	
	public int calc(int n) {
		return num + n;
	}
	
	public static void main(String[] args) {
//		int result = new LambdaTest1().calc(3);
//		System.out.println(result );
		LambdaTest1 lt = new LambdaTest1();
//		lt.test1();
//		lt.test2();
		lt.test3();
	}
	
	/**
	 * 함수형 인터페이스 Koo를 생성
	 * 추상메서드 : 정수 2개를 입력받기.
	 * - 람다표현식 생성 : 큰수를 리턴하도록 override 하기
	 */
	private void test3() {
		Koo koo = (a, b) -> (a > b ? a : b);
		System.out.println(koo.big(3, 5));
		System.out.println(koo.big(10, 5));
	}

	private void test2() {
//		Pita pita = (int a, int b) -> {
//			return Math.sqrt(a * a + b * b);
//		};
		
		Pita pita = (a, b) -> Math.sqrt(a * a + b * b);
		
		System.out.println(pita.calc(10,  5));
		System.out.println(pita.calc(30,  50));

	}
	
	/**
	 * a^2 + b^2 = c^2
	 */
	private void test1() {
		//익명클래스 선언 & 객체생성
		Pita pita = new Pita() {

			@Override
			public double calc(int a, int b) {
				return Math.sqrt(square(a) + square(b));
			}
		};
		System.out.println(pita.calc(10,  5));
		System.out.println(pita.calc(30,  50));
	}	
}

@FunctionalInterface
interface Koo{
	int big(int a, int b);
}

/**
 * 함수형 인터페이스
 * @FunctionalInterface는 하나의 추상메소드만 허용
 * 나중에 람다식을 썼을 때, 헷갈리지 않고,
 * 어떤 추상메소드에 대한 람다식인지 알 수가 있음.
 */

@FunctionalInterface
interface Pita{
	double calc(int a, int b);
	
	default int square(int x) {
		return x * x;
	}
}
