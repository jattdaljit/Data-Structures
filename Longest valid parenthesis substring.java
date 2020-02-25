/**
 * Given a string S consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.
 * <p>
 * Input:
 * First line contains number of test cases T.  Each test case have one line string S of character '(' and ')' of length  N.
 * <p>
 * Constraints:
 * 1 <= T <= 500
 * 1 <= N <= 105
 * <p>
 * Example:
 * Input:
 * 2
 * ((()
 * )()())
 * <p>
 * Output:
 * 2
 * 4
 * <p>
 * Explanation:
 * Testcase 1: Longest valid balanced parantheses is () and its length is 2.
 */

import java.util.Scanner;
import java.util.Stack;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String input = sc.nextLine();
            char[] c = input.toCharArray();
            Stack<Character> inputStack = new Stack<>();
            int tempCount = 0, MaxCount = 0, totalmain = 0;
            int pointer = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[j] == '(') {
                    inputStack.push(c[j]);
                } else {
                    if (inputStack.isEmpty()) {
                        inputStack.push(')');
                        j = c.length - 1;
                    } else {
                        inputStack.pop();
                        tempCount += 2;

                    }
                }
                if (inputStack.empty()) {
                    MaxCount = tempCount;
                    pointer = j;
                }
                if (j == c.length - 1 && pointer != c.length) {
                    inputStack.clear();
                    if (MaxCount > totalmain) {
                        totalmain = MaxCount;
                    }
                    tempCount = 0;
                    MaxCount = 0;
                    j = pointer;
                    pointer = j + 1;
                }

            }
            System.out.println(totalmain);

        }
    }
}