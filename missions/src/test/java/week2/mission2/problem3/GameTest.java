package week2.mission2.problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game;
    @BeforeEach
    void test() {
         game = new Game();
    }

    @Test
    void 주사위굴리기() {
        System.out.println(game.rollDice());
    }

    @Test
    void 과일삽입() {
        int dice = 6;
        game.getResult(0,6);
    }
}