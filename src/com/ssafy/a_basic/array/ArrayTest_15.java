package com.ssafy.a_basic.array;

public class ArrayTest_15 {
    public static void main(String[] args) {
        // TODO: 문제에서 제시하는 2차원 배열을 생성하고 내용을 출력하시오.
        // END:
    	char grid[][] = {{'C', 'A', 'A'},
    			{'C', 'C', 'B'},
    			{'B', 'A', 'B'},
    			{'C', 'C', 'C'}};
    	for(char[] chars : grid) {
    		for(char ch : chars) {
    			System.out.print(ch);
    		}
    		System.out.println();
    	}
    }
}
