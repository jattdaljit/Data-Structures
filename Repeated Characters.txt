/**
 * Given a string - "str", find the repeated character present first in the string.
 * <p>
 * Example :
 * Input  :  geeksforgeeks
 * Output :  g
 * (mind that it will be g, not e.)
 * <p>
 * Input :
 * The first line of input contains an integer T denoting the Test cases. Then T test cases follow.
 * Second line contains the string - "str"
 * <p>
 * Output :
 * repeated character present first in the string, if present
 * otherwise print "-1"
 * <p>
 * <p>
 * Input :
 * 3
 * hello
 * fg
 * geeksforgeeks
 * <p>
 * Output :
 * l
 * -1
 * g
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            Map<Character, Integer> map = new LinkedHashMap<>();
            for (int j = 0; j < c.length; j++) {
                if (map.containsKey(c[j])) {
                    map.put(c[j], map.get(c[j]) + 1);
                } else {
                    map.put(c[j], 1);
                }
            }
            boolean flag = false;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey());
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(-1);
            }
        }

    }
}