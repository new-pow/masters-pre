package week2.algorithm.problem2;

import java.util.*;
public class Problem3 {
     public int[] solution(int[] numbers) {
        Set<Integer> answerSet = new HashSet<>();

        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                answerSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = answerSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}

// 훨씬 빠른 코드

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        TreeSet<Integer> arr = new TreeSet<>();
        int idx = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                arr.add(numbers[i] + numbers[j]);
            }
        }

        answer = new int[arr.size()];

        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            answer[idx++] = (int)iterator.next();
        }

        return answer;
    }
}