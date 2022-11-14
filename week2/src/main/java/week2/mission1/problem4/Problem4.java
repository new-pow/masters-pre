package week2.mission1.problem4;
import java.util.Scanner;

import static week2.mission1.problem4.Controller.*;
import static week2.mission1.problem4.Printer.*;

public class Problem4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int turn = 0;

        startGame();

        askPlayerNum();
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] players = Player.getPlayers(n);
        startWord();

        char chain = Controller.getChain("기러기");
        playTurn(players, chain, turn);
    }
}