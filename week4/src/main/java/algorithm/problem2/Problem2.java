package algorithm.problem2;

/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
* */

public class Problem2 {
    // 문제 조건 고려
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if (x<0) {
            sb.append("-");
            x= x*(-1);
        }
        String str = Integer.toString(x);
        for (int i=str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

//    public int reverse(int x) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(Math.abs(x));
//        sb.reverse();
//        int answer = Integer.parseInt(sb.toString());
//        return x<0 ? answer*(-1) : answer;
//    }

    // 에러
//    java.lang.NumberFormatException: For input string: "9646324351"
//    at line 67, java.base/java.lang.NumberFormatException.forInputString
//    at line 668, java.base/java.lang.Integer.parseInt
//    at line 786, java.base/java.lang.Integer.parseInt
//    at line 7, Solution.reverse
//    at line 54, __DriverSolution__.__helper__
//    at line 84, __Driver__.main
}
