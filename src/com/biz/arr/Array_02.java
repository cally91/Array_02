package com.biz.arr;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {
		
		
		int[] intkor=new int[100];
		Random rnd = new Random();
		for(int i=0 ;i<intkor.length;i++) {
			intkor[i] =rnd.nextInt(50)+51;
			
			}
		//향상된 for, forEach
		for(int n: intkor) {
			System.out.print(n + "\t");
		}
		
		for(int i =0; i< intkor.length;i++) {
			int n=intkor[i];
			System.out.println(n);
		}
		//intkor의 총점 구하기
		int intSum=0;
		for(int n: intkor) {
			intSum +=n;
		}
		System.out.print("총점 : "+ intSum);
	}

}
