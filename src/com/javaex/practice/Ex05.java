package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int[] num=new int[5];
		double sum=0;
		
		for(int i=0; i<5; i++) {
			num[i]=s.nextInt();
			sum+=num[i];
		}
		
		System.out.println("평균은 "+sum/5+"입니다.");
		s.close();
	}

}
