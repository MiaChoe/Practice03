package com.javaex.practice;//Yet Done//분석: i가 1,2,3,4로 출력될 때까지만 작동=>틀렸어.5도 출력됨.
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i = 1;
		 boolean flag = true;
		 
		 while(flag) {
			 if(i>=5) {
				 flag = false;
			 }
			 System.out.println(i);
			 i=i+1;
			 
		 }
		
	}

}
