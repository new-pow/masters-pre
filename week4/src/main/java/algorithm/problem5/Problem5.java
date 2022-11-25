package algorithm.problem5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem5 {
    public static String longestCommonPrefix(String[] strs) {
        String stand = strs[0];
        String answer = "";
        for (String str : strs) {
            answer = twoPrefix(stand, str);
            stand = answer;
        }
        return answer;
    }

    public static String twoPrefix (String a, String b) {
        String answer = "";
        int size = Math.min(a.length(), b.length());
        for (int i=0; i<size; i++) {
            if (a.charAt(i)==b.charAt(i)) {
                answer += String.valueOf(a.charAt(i));
            } else {
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] strs = {"aaa","aa","aaa"};
        longestCommonPrefix(strs);
    }
}
