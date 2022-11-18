package mission02.problem1;


public class Player  {
    protected static PlayerLevel level;

    public Player() {
        this.level = new Beginner();
    }

    public static PlayerLevel getLevel() {
        return level;
    }

    public void play(int time) {
        level.showLevelMessage();
        level.go(time);
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }
}
