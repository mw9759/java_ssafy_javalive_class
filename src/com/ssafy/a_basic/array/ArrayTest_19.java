package com.ssafy.a_basic.array;

public class ArrayTest_19 {

    public static void main(String[] args) {

        char[][] grid = { { '2', '3', '1', '4' },
                { '1', 'X', '3', '2' },
                { '3', '4', 'X', 'X' },
                { 'X', '4', '1', '5' } };

        int sum = 0;
        // TODO: X로 표시된 항목의 좌우 숫자의 합을 구하시오.
        // END:
        for(char[] chars : grid) {
        	char stack = '0';
        	for(char c : chars) {
        		if(c != 'X') {
        			if(stack == 'X')
        				sum += c - '0';
        			stack = c;
        		}else {
        			if(stack != 'X')
        				sum += stack - '0';
        			stack = 'X';
        		}
        		
        	}
        }
        System.out.println(sum);
    }
}
