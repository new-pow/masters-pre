package mission02.problem1;

abstract public class PlayerLevel {

    abstract public void jump();

    abstract public void run();

    abstract public void turn();

    public void go(int time) {
        run();
        for(int i =0; i < time; i++) {
            jump();
        }
        turn();
    }

    abstract void showLevelMessage();
}
