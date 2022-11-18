package mission2.problem1;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        player.upgradeLevel(new Advenced());
        player.play(2);
        player.upgradeLevel(new Super());
        player.play(3);
    }
}
