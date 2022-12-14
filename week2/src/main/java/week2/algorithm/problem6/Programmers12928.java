package week2.algorithm.problem6;

public class Programmers12928 {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            if (n%i==0) answer+=i;
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.01ms, 74.8MB)
테스트 2 〉	통과 (0.03ms, 78.7MB)
테스트 3 〉	통과 (0.03ms, 73MB)
테스트 4 〉	통과 (0.03ms, 73.6MB)
테스트 5 〉	통과 (0.03ms, 76.1MB)
테스트 6 〉	통과 (0.04ms, 82.9MB)
테스트 7 〉	통과 (0.07ms, 76.1MB)
테스트 8 〉	통과 (0.03ms, 73.6MB)
테스트 9 〉	통과 (0.05ms, 72.5MB)
테스트 10 〉	통과 (0.08ms, 78.9MB)
테스트 11 〉	통과 (0.07ms, 77.1MB)
테스트 12 〉	통과 (0.05ms, 80MB)
테스트 13 〉	통과 (0.02ms, 74.7MB)
테스트 14 〉	통과 (0.05ms, 76.5MB)
테스트 15 〉	통과 (0.07ms, 64.5MB)
테스트 16 〉	통과 (0.02ms, 75.4MB)
테스트 17 〉	통과 (0.05ms, 77.3MB)
*/

// 자기 자신은 무조건 더하게 되므로 다음과 같이 할 수도 있다.
// 근데 시간은 미묘하게 더 걸리는 것 같다.
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n/2; i++) {
            if (n%i==0) answer+=i;
        }
        return answer+n;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 84.4MB)
테스트 2 〉	통과 (0.03ms, 76.8MB)
테스트 3 〉	통과 (0.03ms, 82.5MB)
테스트 4 〉	통과 (0.03ms, 75MB)
테스트 5 〉	통과 (0.04ms, 86.3MB)
테스트 6 〉	통과 (0.03ms, 73.8MB)
테스트 7 〉	통과 (0.64ms, 82MB)
테스트 8 〉	통과 (0.03ms, 74.1MB)
테스트 9 〉	통과 (0.03ms, 74.9MB)
테스트 10 〉	통과 (0.07ms, 77.8MB)
테스트 11 〉	통과 (0.03ms, 79.5MB)
테스트 12 〉	통과 (0.06ms, 72.7MB)
테스트 13 〉	통과 (0.01ms, 73.3MB)
테스트 14 〉	통과 (0.05ms, 69MB)
테스트 15 〉	통과 (0.06ms, 75.4MB)
테스트 16 〉	통과 (0.02ms, 81.9MB)
테스트 17 〉	통과 (0.07ms, 73.2MB)
*/