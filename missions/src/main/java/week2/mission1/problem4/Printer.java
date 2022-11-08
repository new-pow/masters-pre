package week2.mission1.problem4;

public class Printer {
    static String startWord = "기러기";
    public static void startGame() {
        System.out.println("끝말잇기 게임을 시작합니다!!");
    }
    public static void askPlayerNum(){
        System.out.print("게임에 참여하는 인원은 몇 명입니까 >> ");
    }
    public static void startWord() {
        System.out.println("시작 단어는 "+ startWord +"입니다.");
    }
    public static void alertTurn(String player) {
        System.out.print(player+">> ");
    }
    public static void endGame(String player) {
        System.out.println(player+"이 졌습니다.");
    }
}
