package week2.mission2.problem3;

import static week2.mission2.problem3.Game.getResult;

public class Problem3 {
    public static void main(String[] args) {
        Game game = new Game();
        Originator gamer = game.getGamer();
        Memento memento = Memento.getMemento(gamer.getMoney(),gamer.getFruits());
        int turn = 100;
        int fruitNum = 0;

        while (turn>0 && gamer.getMoney()>0) {
            int dice = game.rollDice(); // 주사위 던지기

            game.printRoll(101-turn, dice);
            fruitNum = getResult(fruitNum, dice); // 결과 처리

            if (gamer.getMoney() > memento.getMoney()) { // 메멘토 처리
                memento = gamer.createMemento(memento);
            } else if (gamer.getMoney()<(memento.getMoney()/2)) {
                gamer.setMemento(memento);
            }

            game.printGamerState();
            turn --;
        }
    }
}
