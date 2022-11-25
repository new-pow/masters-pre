package algorithm.problem3;

public class Problem3 {
    public static boolean isPalindrome(int x) {
        int a = 0;
        int copy = x;

        if (x<0) return false;
        while(x>0) {
            a*=10;
            int temp = x%10;
            a = (a+temp);
            x /= 10;
        }

        if (a==copy) return true;
        return false;
    }

    public static void main(String[] args) {
        isPalindrome(-121);
    }
}
