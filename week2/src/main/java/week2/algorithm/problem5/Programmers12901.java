package week2.algorithm.problem5;

public class Programmers12901 {
    public static String solution(int a, int b) {
        int[] lastdays = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"THU","FRI","SAT","SUN","MON","TUE","WED"};

        int countDay = b;

        // 월 -> 일
        for (int i=0; i<a; i++) {
            int lastday = lastdays[i];
            countDay += lastday;
        }

        String day = days[countDay%7];
        return day;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 74.4MB)
테스트 2 〉	통과 (0.02ms, 75.8MB)
테스트 3 〉	통과 (0.02ms, 77.4MB)
테스트 4 〉	통과 (0.03ms, 72.9MB)
테스트 5 〉	통과 (0.02ms, 82MB)
테스트 6 〉	통과 (0.03ms, 75.3MB)
테스트 7 〉	통과 (0.03ms, 72.6MB)
테스트 8 〉	통과 (0.02ms, 75MB)
테스트 9 〉	통과 (0.02ms, 72.3MB)
테스트 10 〉	통과 (0.02ms, 68.7MB)
테스트 11 〉	통과 (0.03ms, 77MB)
테스트 12 〉	통과 (0.02ms, 73.2MB)
테스트 13 〉	통과 (0.04ms, 90.2MB)
테스트 14 〉	통과 (0.03ms, 76.8MB)
*/