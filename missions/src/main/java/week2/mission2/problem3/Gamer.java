package week2.mission2.problem3;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
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

    public Caretaker() {
        money = 1000;
        fruits = new ArrayList<>();
    }

    public void printState() {
        System.out.println("Gamer ----------------------------");
        System.out.println("Money > "+this.money);
        System.out.println("Fruits > " + this.fruits.toString());
        System.out.println("----------------------------------");
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
}
