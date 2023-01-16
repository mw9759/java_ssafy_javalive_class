package com.ssafy.a_basic.array;

public class ArrayTest_11 {
	public static void main(String[] args) {
		int[] intArray = { 3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54 };
		
		double avg = 0;
		double maxIdx_ = Double.MIN_VALUE;
		double minIdx_ = Double.MAX_VALUE;
		int maxIdx = 0;
		int minIdx = 0;
		int sum = 0;
		for(int i : intArray) {
			sum += i;
		}
		avg = sum/intArray.length;
		
		for(int i = 0; i< intArray.length; i++) {
			if(Math.abs(intArray[i]-avg)> maxIdx_) {
				maxIdx_ = Math.abs(intArray[i]-avg);
				maxIdx = i;
			}
			if(Math.abs(intArray[i]-avg)< minIdx_) {
				minIdx_ = Math.abs(intArray[i]-avg);
				minIdx = i;
			}
		}
		// TODO: 위 배열의 요소 중 평균(실수, 소숫점 세째에서 반올림 출력)과 
		//  평균과 절대의 차이가 가장 큰값, 차이가 가장 작은 값을 출력하시오.
		// END:
		System.out.printf("avg:%.2f, maxDiff: %d, minDiff:%d%n", avg, intArray[maxIdx], intArray[minIdx]);

	}
}
