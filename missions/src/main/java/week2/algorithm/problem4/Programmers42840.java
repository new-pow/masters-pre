package week2.algorithm.problem4;

import java.util.ArrayList;
import java.util.List;

public class Programmers42840 {
    public int[] solution(int[] answers) {
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];

        for (int i=0; i<answers.length; i++) {
            if (answers[i]==person1[i%person1.length]) scores[0] ++;
            if (answers[i]==person2[i%person2.length]) scores[1] ++;
            if (answers[i]==person3[i%person3.length]) scores[2] ++;
        }
        int max = Math.max(scores[0],scores[1]);
        max = Math.max(scores[2],max);

        int count = 0;
        for (int score : scores) {
            if(max==score) {
                count ++;
            }
        }

        int[] answer = new int[count];
        int idx = 0;
        for (int i=0; i<scores.length; i++) {
            if(max==scores[i]) {
                answer[idx++] = i+1;
            }
        }

        return answer;
    }
}

// 결과
/*
 테스트 1 〉	통과 (0.03ms, 73.8MB)
테스트 2 〉	통과 (0.04ms, 73MB)
테스트 3 〉	통과 (0.03ms, 66.4MB)
테스트 4 〉	통과 (0.04ms, 72.6MB)
테스트 5 〉	통과 (0.02ms, 79MB)
테스트 6 〉	통과 (0.04ms, 77.8MB)
테스트 7 〉	통과 (0.51ms, 79.5MB)
테스트 8 〉	통과 (0.12ms, 75.3MB)
테스트 9 〉	통과 (0.56ms, 75.4MB)
테스트 10 〉	통과 (0.42ms, 87.6MB)
테스트 11 〉	통과 (0.78ms, 77.9MB)
테스트 12 〉	통과 (0.51ms, 73.7MB)
테스트 13 〉	통과 (0.06ms, 73.9MB)
테스트 14 〉	통과 (1.00ms, 80.6MB)
* */

// 이 방법이 조금 더 느리다.

class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];

        for (int i=0; i<answers.length; i++) {
            if (answers[i]==person1[i%person1.length]) scores[0] ++;
            if (answers[i]==person2[i%person2.length]) scores[1] ++;
            if (answers[i]==person3[i%person3.length]) scores[2] ++;
        }

        int max = Math.max(scores[2],Math.max(scores[0],scores[1]));

        List<Integer> arr = new ArrayList<>();

        for (int i=0; i<scores.length; i++) {
            if(max==scores[i]) {
                arr.add(i+1);
            }
        }

        int[] answer = new int[arr.size()];
        for (int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.06ms, 75.4MB)
테스트 2 〉	통과 (0.06ms, 82.2MB)
테스트 3 〉	통과 (0.05ms, 106MB)
테스트 4 〉	통과 (0.05ms, 76.9MB)
테스트 5 〉	통과 (0.06ms, 83.3MB)
테스트 6 〉	통과 (0.07ms, 74.1MB)
테스트 7 〉	통과 (0.32ms, 76.5MB)
테스트 8 〉	통과 (0.22ms, 80.4MB)
테스트 9 〉	통과 (0.54ms, 77.9MB)
테스트 10 〉	통과 (0.28ms, 73.2MB)
테스트 11 〉	통과 (0.98ms, 78.7MB)
테스트 12 〉	통과 (0.84ms, 75.3MB)
테스트 13 〉	통과 (0.08ms, 77.6MB)
테스트 14 〉	통과 (1.03ms, 76.7MB)
*/