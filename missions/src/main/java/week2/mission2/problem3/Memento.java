package week2.mission2.problem3;

import java.util.List;

public class Memento {
    private int money;
    private List<String> fruits;

    static Memento memento;

    // set state
    private Memento(int money, List<String> fruits) {
        this.money = money;
        this.fruits = fruits;
    }

    public static Memento getMemento(int money, List<String> fruits) {
        if (memento==null) {
            return new Memento( money, fruits);
        }
        return memento;
    }

    public int getMoney() {
        return money;
    }

    public List<String> getFruits() {
        return fruits;
    }
}
