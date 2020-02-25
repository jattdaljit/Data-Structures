/**
 * Merge two strings
 * Given two strings S1 and S2 as input, the task is to merge them alternatively
 * i.e. the first character of S1 then the first character of S2 and so on till the strings end.
 * <p>
 * NOTE: Add the whole string if other string is empty.
 * <p>
 * Input:
 * The first line of input contains an integer T denoting the number of test cases. 
 * Then T test cases follow. Each test case contains two strings S1 and S2.
 * <p>
 * Output:
 * For each test case, in a new line, print the merged string.
 * <p>
 * Constraints:
 * 1 <= T <= 100
 * 1 <= |S1|, |S2| <= 104
 * <p>
 * Example:
 * Input:
 * 2
 * Hello Bye
 * abc def
 * <p>
 * Output:
 * HBeylelo
 * adbecf
 */

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String total = sc.nextLine();
            String[] s = total.split(" ");
            String output = "";
            int j = 0;
            char[] s1 = s[0].toCharArray();
            char[] s2 = s[1].toCharArray();
            while (j < s1.length || j < s2.length) {
                if (j >= s1.length && j < s2.length) {
                    output = output + s2[j];
                } else if (j < s1.length && j >= s2.length) {
                    output = output + s1[j];
                } else {
                    output = output + s1[j] + s2[j];
                }
                j++;
            }
            System.out.println(output);
        }

    }
}