package week2.mission1.problem4;

import java.util.Scanner;

public class Player {
    static Scanner scanner;

    // 플레이어 입력 함수
    public static String[] getPlayers(int n) {
        scanner = new Scanner(System.in);
        String[] players = new String[n];
        for (int i=0; i<n; i++) {
            System.out.print("참가자 이름을 입력해주세요. >> ");
            players[i] = scanner.nextLine().trim();
        }
        return players;
    }
}
