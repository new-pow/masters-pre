package mission02.problem1;

public class Beginner extends PlayerLevel {

    @Override
    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void turn() {
         System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("\nBeginner 입니다.");
    }


}
