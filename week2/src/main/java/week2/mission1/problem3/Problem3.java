package week2.mission1.problem3;

public class Problem3 {
    static EscapeMaze miro = new EscapeMaze();

    public static void main(String[] args) {

        for (On i : miro.escape(0,1)) {
            System.out.print("("+i.getX()+","+i.getY()+")->");
        }
        System.out.println("(7,7)");
    }
}
