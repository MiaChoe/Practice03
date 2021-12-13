/*Done//2021.11.18(목)08:17 예상:3*4꼴의 별=>틀렸다. 왜 일렬로 쭉이지?/2021.12.14(화)01:03 Done

[문제] Ex03 아래의 출력결과를 예상하여 작성하세요.
(코드를 작성해서 예상과 맞는지 확인해 보세요.)

*/
package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {

		int x, y;
		for (x = 0; x < 4; x++) {
			for (y = 2; y >= 0; y--) {
				System.out.print("*");
			}
		}
		System.out.println("");

	}

}

/*
2021.12.14(화)01:08 이제서야 눈에 들어오는 print와 println의 차이. 이 마저도 시간이 걸렸음.
*/