package week2.algorithm.problem2;

import org.junit.jupiter.api.Test;

class Programmers64061Test {
    @Test
    void name() {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        Programmers64061.solution(board,moves);
    }
}