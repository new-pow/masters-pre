package week2.mission2.problem3;

import java.util.ArrayList;
import java.util.List;

public class Originator {

    int money;
    List<String> fruits;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public Originator() {
        this.money = 1000;
        this.fruits = new ArrayList<>();
    }

    public void plusMoney(int income) {
        this.money += income;
    }

    public void divideMoney() {
        this.money /= 2;
    }

    public void plusFruit(String fruit) {
        this.fruits.add(fruit);
    }

    public void setMemento(Memento m) {
        this.money = m.getMoney();
        this.fruits = m.getFruits();
    }

    public Memento createMemento(Memento m) {
        return m.getMemento(this.money, this.fruits);
    }
}
