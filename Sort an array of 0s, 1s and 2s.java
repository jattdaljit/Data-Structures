/**
 * Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.
 * <p>
 * Input:
 * The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow.
 * Each testcases contains two lines of input. The first line denotes the size of the array N.
 * The second lines contains the elements of the array A separated by spaces.
 * <p>
 * Output:
 * For each testcase, print the sorted array.
 * <p>
 * Constraints:
 * 1 <= T <= 500
 * 1 <= N <= 106
 * 0 <= Ai <= 2
 * <p>
 * Example:
 * Input :
 * 2
 * 5
 * 0 2 1 2 0
 * 3
 * 0 1 0
 * <p>
 * Output:
 * 0 0 1 2 2
 * 0 0 1
 * <p>
 * Explanation:
 * Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.
 */

import java.util.Arrays;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] data = new int[N];
            for (int j = 0; j < N; j++) {
                data[j] = sc.nextInt();
            }
            Arrays.sort(data);
            for (int k = 0; k < N; k++) {
                System.out.print(data[k] + " ");
            }
            System.out.println();
        }

    }
}
