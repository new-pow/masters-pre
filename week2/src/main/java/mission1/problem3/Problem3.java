package mission1.problem3;

public class Problem3 {
    static EscapeMaze game = new EscapeMaze();

    public static void main(String[] args) {

        for (Now i : game.bfs(0,1)) {
            System.out.print("("+i.getX()+","+i.getY()+")->");
        }
        System.out.println("(7,7)");
    }
}
