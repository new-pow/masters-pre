package algorithm.problem4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem4 {
    public static int romanToInt(String s) {
        Map<String, Integer> roman = new HashMap<>();
        roman.put("IV", 4);
        roman.put("IX", 9);
        roman.put("XL", 40);
        roman.put("XC", 90);
        roman.put("CD", 400);
        roman.put("CM", 900);
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        int answer = 0;
        for (int i=0; i<s.length(); i++) {
            String word = String.valueOf(s.charAt(i));
            if ((word.equals("I") || word.equals("X") || word.equals("C")) && i<s.length()-1) {
                String newWord = word + String.valueOf(s.charAt(i+1));
                if (roman.keySet().contains(newWord)) {
                    answer += roman.get(newWord);
                    i ++;
                    continue;
                } else {
                    answer += roman.get(word);
                }
            } else {
                answer += roman.get(word);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        romanToInt("LVIII");
    }

    /* 참고용 코드
     static final Map<String, Integer> DATA = new HashMap();

    public int romanToInt(String s) {
        int sum = 0;
        char[] characters = s.toCharArray();
        for(int i = 0; i < characters.length; i++) {
            char character = characters[i];
            int currentValue = DATA.get(String.valueOf(character));
            if (i + 1 < characters.length) {
                char nextCharacter = characters[i + 1];
                int nextValue = DATA.get(String.valueOf(nextCharacter));
                switch(character) {
                    case 'I': {
                        if (nextCharacter == 'V' || nextCharacter == 'X') {
                            sum += nextValue - currentValue;
                            i++;
                        } else {
                            sum += currentValue;
                        }
                    } break;
                    case 'X': {
                        if (nextCharacter == 'L' || nextCharacter == 'C') {
                            sum += nextValue - currentValue;
                            i++;
                        } else {
                            sum += currentValue;
                        }
                    } break;
                    case 'C': {
                        if (nextCharacter == 'D' || nextCharacter == 'M') {
                            sum += nextValue - currentValue;
                            i++;
                        } else {
                            sum += currentValue;
                        }
                    } break;
                    default: {
                        sum += currentValue;
                    } break;
                }
            } else {
                sum += currentValue;
            }
        }
        return sum;
    }

    static {

        DATA.put("I", 1);
        DATA.put("V", 5);
        DATA.put("X", 10);
        DATA.put("L", 50);
        DATA.put("C", 100);
        DATA.put("D", 500);
        DATA.put("M", 1000);

    }
    * */
}
