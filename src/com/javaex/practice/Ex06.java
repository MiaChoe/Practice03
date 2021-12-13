//Done//2021.11.18(목)/2021.12.14(화)01:27

package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {

		int i;
		for (i = 1; (i >= 1 && i <= 100); i++) {
			while ((i % 5 == 0 && i % 7 == 0)) {
				System.out.println(i);
				i++;
			}

		}

	}
}

/*
2021.11.18(목) 출제포인트:조건문에&&를 쓰되 한계값 설정 적용하기(for문)안의 while문에 i++안 쓰니까 출력값35
goes infinite
*/