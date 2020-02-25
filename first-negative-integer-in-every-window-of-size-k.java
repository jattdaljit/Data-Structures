Given an array and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n denoting the size of the array. The next line contains n space separated integers forming the array. The last line contains the window size k.

Output:
Print the space separated negative integer starting from the first till the end for every window size k. If a window does not contain a negative integer , then print 0 for that window.

Constraints:
1<=T<=10^5
1<=n<=10^5
1<=a[i]<=10^5
1<=k<=n

Example:
Input:
2
5
-8 2 3 -6 10
2
8
12 -1 -7 8 -15 30 16 28
3

Output:
-8 0 -6 -6
-1 -1 -7 -15 -15 0

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
            int k = sc.nextInt();
            for (int j = 0; j < N; j++) {
                int l = j;
                boolean flag = false;
                while (l < j + k) {
                    if (input[l] < 0) {
                        System.out.print(input[l] + " ");
                        flag = true;
                        break;
                    }
                    l++;
                }
                if(!flag){
                    System.out.print(0 + " ");
                }
                if (j + k == N) break;
            }
            System.out.println();
        }
    }
}