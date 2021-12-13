/*Still UnDone/2021.11.18(목)10:36/2021.12.14(화)01:34-02:02 

[문제] Ex07 숫자를 입력받아 아래와 같이 출력하세요

*/

package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int x = 1;
		int y = 1;

		for (x = 1; (y <= num); y++) {
			while (x <= y) {
				System.out.print(y);
				x++;
			}

			System.out.println("");
		}
		sc.close();
	}

}

/*
 * sc받은수 int num잡고 이게 사실상 x축이고, int v를 세로축으로 잡아. 내가 시도한 1이니까 한 개, 2니까 두 개(x이니까
 * x개)이 방식은 탈출 문제가 있으니 잘 두었다가 후에 적용해보자
 * 
 * int num = sc.nextInt();, for(x=1; (x<=num); x++0 { while (x=y) println} 이 형식
 * y가 x와 어떤 관계인지 설정을 해줘야 알 것
 * 
 * 상선 씨께 질문 후 copy: 내가 쓴 안for조건대로 라면 가로축이 2가 되었을 때 아예 더는 진행이 안돼. 이 방법 신기하다. x축은
 * 0인 채로 두고 y를 증가 시켜서 출력도 y를 하고 x가 y보다 작을 때까지.
 * 
 * package com.javaex.practice;
 * 
 * import java.util.Scanner;
 * 
 * public class Ex07 {
 * 
 * public static void main(String[] args) { //다시 복습하기!! Scanner sc = new
 * Scanner(System.in); System.out.println("숫자를 입력하세요."); int num = sc.nextInt();
 * 
 * for(int y=1; y<=num; y++) { for(int x=0; x<y; x++) { System.out.print(y); }
 * System.out.println(""); }
 * 
 * sc.close();
 * 
 * }
 * 
 * }
 * 
 */