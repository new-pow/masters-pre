package week2.mission2.problem3;

import java.util.Random;

public class Game {
    private static Originator gamer;
    private static String[] fruits = {"사과", "샤인머스킷", "귤"};

    public Originator getGamer() {
        return gamer;
    }

    public static String getFruits(int i) {
        return fruits[i%fruits.length];
    }

    public Game() {
        gamer = new Originator();
    }

    public int rollDice() {
        Random r = new Random();
        int dice = r.nextInt(6) + 1;
        return dice;
    }

    public static int getResult(int fruitNum, int dice) {
        switch (dice){
            case 1, 3:
                gamer.plusMoney(100);
                break;
            case 2, 4:
                gamer.divideMoney();
                break;
            case 6:
                gamer.plusFruit(getFruits(fruitNum++));
                break;
            default:
        }
        return fruitNum;
    }

    public void printGamerState() {
        System.out.printf(
                "Gamer ----------------------------\n" +
                "Money > %d \n" + "Fruits > %s \n" +
                "----------------------------------\n",
                gamer.getMoney(), gamer.getFruits().toString());
    }

    public void printRoll(int turn, int dice) {
        System.out.println(turn+"턴 주사위 눈금 : " + dice);
    }
}