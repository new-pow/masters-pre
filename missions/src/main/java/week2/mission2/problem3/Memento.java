package week2.mission2.problem3;

import java.util.List;

public class Memento {
    private int money;
    private List<String> fruits;

    // set state
    public Memento(int money, List<String> fruits) {
        this.money = money;
        this.fruits = fruits;
    }

    public int getMoney() {
        return money;
    }

    public List<String> getFruits() {
        return fruits;
    }
}
