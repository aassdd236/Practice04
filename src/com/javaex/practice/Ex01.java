package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0]=3;
		intArray[1]=7;
		intArray[2]=12;
		
		int result=0;
		
		//0부터 length까자 하면 실제 배열의 크기보다 1 큼
		for(int i=0; i<intArray.length; i++) {
			result = result + intArray[i];
		}

		System.out.println(result);
	}

}
