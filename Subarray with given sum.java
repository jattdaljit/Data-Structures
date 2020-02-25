/**
 * Given an unsorted array A of size N of non-negative integers,
 * find a continuous sub-array which adds to a given number S.
 * <p>
 * Input:
 * The first line of input contains an integer T denoting the number of test cases.
 * Then T test cases follow. Each test case consists of two lines. The first line of each
 * test case is N and S, where N is the size of array and S is the sum. The second line of
 * each test case contains N space separated integers denoting the array elements.
 * <p>
 * Output:
 * For each testcase, in a new line, print the starting and ending positions(1 indexing) of
 * first such occuring subarray from the left if sum equals to subarray, else print -1.
 * <p>
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 107
 * 1 <= Ai <= 1010
 * <p>
 * Example:
 * Input:
 * 2
 * 5 12
 * 1 2 3 7 5
 * 10 15
 * 1 2 3 4 5 6 7 8 9 10
 * Output:
 * 2 4
 * 1 5
 * <p>
 * Explanation :
 * Testcase1: sum of elements from 2nd position to 4th position is 12
 * Testcase2: sum of elements from 1st position to 5th position is 15
 */
package com.daljit.demo;

import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int S = sc.nextInt();
			int[] data = new int[N];
			for (int j = 0; j < N; j++) {
				data[j] = sc.nextInt();
			}
			int tempSum = 0;
			int startElementIndex = 0;
			int lastElementIndex = 0;
			for (int k = startElementIndex; k < data.length; k++) {
				tempSum += data[k];
				if (tempSum > S) {
					startElementIndex++;
					k = startElementIndex - 1;
					tempSum = 0;
				} else if (tempSum == S) {
					lastElementIndex = k;
					break;
				}
			}
			if (lastElementIndex == 0) {
				System.out.println(-1);
			} else {
				System.out.println((startElementIndex + 1) + " " + (lastElementIndex + 1));
			}

		}

	}
}