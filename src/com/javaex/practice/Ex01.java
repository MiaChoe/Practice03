//Done//출제포인트: while문과 for문의 표시법과 각각의 결과 출력 방법 보기. 두 변수는 for와 while 단어,변수 이름 빼고 둘은 같은 형태일 것이다=>옳다
//for문에서 조건문은 for문 열기 전 따로 선언하지 않고 for 안에서 최초로 자료형을 정해줘도 무방함/2021.12.14(화)00:49

package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("while문");
		int index = 0;
		while (index < 3) {
			System.out.println("index=" + index);
			index++;
		}

		System.out.println("for문");
		for (int order = 0; order < 3; order++) {
			System.out.println("order=" + order);
		}

	}

}
