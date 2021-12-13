//Done//2021.11.18(목)08:!7 분석: i가 1,2,3,4로 출력될 때까지만 작동=>틀렸어.5도 출력됨/2021.12.14(화)01:21 Done

package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {

		int i = 1;
		boolean flag = true;

		while (flag) {
			if (i >= 5) {
				flag = false;
			}
			System.out.println(i);
			i = i + 1;

		}

	}

}

/*
2021.12.14(화)01:21_ 1~5까지 출력했고 그 다음 boolean과 while성격 정확히 알아야 함.
즉, i가 1부터 5일 때까지는 if문 속 조건에 해당 안되니 if문은 아예 들어가지도 않고 나와서 Sysout함
i가 6이 되자 flag=false가 되고 이는 while문의 조건인 참값에 위배됨. 즉,
while(flag) {
flag=false;
}라고 쓴 셈. 이 뒤로는 성립 불가
*/