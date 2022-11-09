package week2.algorithm.problem1;

import java.util.Arrays;

public class Programmers12910 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        int[] answer;

        for (int i=0; i<arr.length; i++) {
            if (arr[i]%divisor==0) {
                count++;
            }
        }

        if (count==0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[count];
            int inputCount = 0;
            for (int i=0; i<arr.length; i++) {
                if (arr[i]%divisor==0) {
                    answer[inputCount] = arr[i];
                    inputCount ++;
                }
            }

            Arrays.sort(answer);
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.41ms, 78.4MB)
테스트 2 〉	통과 (0.38ms, 74.8MB)
테스트 3 〉	통과 (0.37ms, 73.3MB)
테스트 4 〉	통과 (0.48ms, 74.6MB)
테스트 5 〉	통과 (0.39ms, 77.1MB)
테스트 6 〉	통과 (1.29ms, 80.7MB)
테스트 7 〉	통과 (0.09ms, 74.1MB)
테스트 8 〉	통과 (0.03ms, 77.9MB)
테스트 9 〉	통과 (0.65ms, 72.6MB)
테스트 10 〉	통과 (0.64ms, 72.3MB)
테스트 11 〉	통과 (0.36ms, 72.6MB)
테스트 12 〉	통과 (0.40ms, 72.9MB)
테스트 13 〉	통과 (0.17ms, 80MB)
테스트 14 〉	통과 (0.66ms, 77MB)
테스트 15 〉	통과 (0.55ms, 82.8MB)
테스트 16 〉	통과 (0.47ms, 76.7MB)
*/