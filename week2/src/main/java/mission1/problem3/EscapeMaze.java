package mission1.problem3;

import java.util.ArrayList;
import java.util.List;

public class EscapeMaze {
    // 미로
    // 0은 open, 1은 close
    private static int[][] maze = {
            {0, 1, 1, 1, 0, 1, 1, 1}, // 1행
            {0, 0, 0, 1, 0, 0, 0, 0}, // 2행
            {1, 1, 0, 0, 0, 1, 0, 1}, // 3행
            {1, 1, 0, 1, 1, 1, 0, 1}, // 4행
            {1, 0, 0, 1, 0, 0, 0, 0}, // 5행
            {0, 1, 1, 1, 0, 1, 1, 1}, // 6행
            {1, 0, 1, 1, 0, 0, 0, 0}, // 7행
            {0, 1, 1, 0, 1, 1, 1, 0}  // 8행
    };

    private  static boolean[][] visit = new boolean[8][8];

    static Boolean exitFlag = false;

    // 이동 가능한 위치
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    // 이동 배열
    static List<Now> move = new ArrayList<>();

    public static List<Now> bfs(int x, int y) {
        Now now = new Now(x,y);
        move.add(now);          // 이동 배열에서 넣기
        visit[y][x] = true;     // 이동 행적 체크

        for (int i=0; i<dx.length; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];

            if (nx>=0 && nx<8 && ny>=0 && ny<8 && maze[ny][nx]==0 && visit[ny][nx]==false) {
                Now temp = new Now(nx,ny);
            if (checkRoad(nx,ny)) {

                // 만약 출구라면 멈추기
                if(nx==7&&ny==7) {
                    // 배열에 넣기
                    exitFlag = true;
                    return move;
                }

                // 추가로 더 가기
                bfs(nx,ny);
                if (!exitFlag) {
//                    System.out.println("되돌아온 길 : ("+nx+", "+ny+")");
                    move.remove(move.size()-1); // 되돌아가는 좌표 제외
                }
            }
        }
        return move;
    }

    private static boolean checkRoad(int x, int y) {
        Boolean check = false;
        if (x>=0 && x<maze.length && y>=0 && y<maze.length) {       // 미로 범위 안인지 체크
            if (maze[y][x]==0 && visit[y][x]==false) {
                check = true;  // 갈 수 있지만, 아직 가지 않은 길인지 체크
            }
        }
        return check;
    }
}