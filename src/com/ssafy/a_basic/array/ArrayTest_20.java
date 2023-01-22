package com.ssafy.a_basic.array;

public class ArrayTest_20 {
	public static void main(String[] args) {

		char[][] grid = {
				{ '2', '3', '1', '4' },
				{ '1', 'X', '3', '2' },
				{ '3', '4', 'X', 'X' },
				{ 'X', '4', '1', '5' } };

		int sum = 0;

		// TODO: X로 표시된 항목의 상좌우 숫자의 합을 구하시오.
		//  단 합을 구할 때 이미 더한 영역은 다시 더하지 않는다.
		// END:
		for(int i = 0; i < 4; i++) {
			char stack = '0';
			//좌우
			for(int j = 0; j < 4; j++) {
				if(grid[i][j] == 'X') {
					if(stack != 'X') {
						sum += stack - '0';
					}
					stack = grid[i][j];
				}else {
					if(stack == 'X') {
						sum += grid[i][j] - '0';
					}
					stack = grid[i][j];
				}
			}
			//상
			for(int j = 1; j < 4; j++) {
				if(grid[j][i] == 'X') {
					if(grid[j-1][i] != 'X')
						sum += grid[j-1][i] - '0';
				}
			}
		}
		System.out.println(sum);
	}
}
