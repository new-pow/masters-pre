package week2.mission1.problem4;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);

    // 차례 진행
    public static void playTurn(String[] players, char chain, int turn) {
        String player = players[turn % players.length];
        // 참가자 단어 입력
        Printer.alertTurn(player);
        String playerWord = scanner.nextLine();
        // 참가자 단어 체크
        if (!isChain(playerWord, chain) || !checkLength(playerWord)) {
            Printer.endGame(player);
            return;
        } else {
            playTurn(players, getChain(playerWord), turn+1);
        }
    }

    // 참가자 단어 입력받은 값 가공
    public static char getChain(String sentence){
        char lastChar = sentence.charAt(sentence.length()-1);
        return lastChar;
    }

    public static boolean checkLength (String word) {
        boolean result = false;
        if (word.length() >= 2) result = true;
        return result;
    }

    public static boolean isChain (String word, char beforeLastLetter) {
        boolean result = false;
        if (beforeLastLetter == word.charAt(0)) result = true;
        return result;
    }
}
