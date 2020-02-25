Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

Constraints:
1 <= T <= 100
3 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
2
4
1 5 3 2
3
3 2 7
Output:
2
-1

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] input = new int[N];
            for (int j = 0; j < N; j++) {
                input[j] = sc.nextInt();
            }
            Set<Integer> checker = new HashSet<Integer>();
            for (int j = 0; j < N; j++) {
                checker.add(input[j]);
            }
            int count = 0;
            for (int j = 0; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++)
                    if (checker.contains(input[j] + input[k])) {
                        count++;
                    }
            }

            if (count != 0) System.out.println(count);
            else System.out.println(-1);
        }
    }
}