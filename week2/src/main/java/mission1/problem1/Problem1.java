package mission1.problem1;

public class Problem1 {
    public static void main(String[] args) {
        char[] letters = new char[26];

        // 문자 배열 A-Z 저장
        for (int i=0; i<letters.length; i++) {
            letters[i] = (char)('A'+ i);
        }

        // 문자 배열 출력
        for (int i=0; i<letters.length; i++) {
            System.out.print(letters[i]+" ");
        }
    }
}
