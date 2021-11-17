package com.javaex.practice;//Done//출제포인트:조건문에&&를 쓰되 한계값 설정 적용하기(for문)
							//안의 while문에 i++안 쓰니까 출력값35 goes infinite

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for (i=1; (i>=1 && i<=100); i++) {
			while ((i%5==0 && i%7==0)) {
			System.out.println(i);
			i++;
			}
		
		}

	}
}