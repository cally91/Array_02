package com.biz.arr;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intkor = new int[5];
		Random rnd = new Random();
		for (int i = 0; i < intkor.length; i++) {

			// 51부터 100까지 임의 수를 생성
			int intRnd = rnd.nextInt(50) + 51;
			intkor[i] = intRnd;
		}
		for (int i = 0; i < intkor.length; i++) {
			System.out.print(intkor[i]);
			if ((i + 1) % 5 == 0)
				System.out.println();
			else
				System.out.print(" , ");
		}

		// 5개의 배열에 담긴 숫자 리스트를
		// 오른차순정렬 (작은 수부터 큰수 순서로) 정렬(sort)해서 나열

		// 70, 60, 51, 90,77이라고 과정
		// leftI righI intkor[leftI] intkor[righI]
		// 0 1 intkor[0]:70 intkor[1];60
		// 70 > 60
		
		//반복적으로 인접한 배열에 담긴 값과 비교하여 자리바꿈을 실행하면서
		//작은수 부터 큰수 순서로 나열하는 코드
		for (int leftI = 0; leftI < intkor.length; leftI++) {
			for (int righI = leftI + 1; righI < intkor.length; righI++) {
				if (intkor[leftI] > intkor[righI]) {

					int _temp = intkor[leftI];
					intkor[leftI] = intkor[righI];
					intkor[righI] = _temp;

				}
			}

		}
		for (int i = 0; i < intkor.length; i++) {
			System.out.print(intkor[i]);
			if ((i + 1) % 5 == 0)
				System.out.println();
			else
				System.out.print(" , ");
		}

	}

}
