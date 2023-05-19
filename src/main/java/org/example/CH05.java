package org.example;

import org.junit.jupiter.api.Test;

public class CH05 {
    @Test
    public void mouseWalkTheMaze() {
        int[][] maze = { //勞贖會從(1,0)走到(6,5) 老鼠會轉彎
                {2, 2, 2, 2, 2, 2, 2},
                {0, 0, 0, 0, 0, 0, 2},
                {2, 0, 2, 0, 2, 0, 2},
                {2, 0, 0, 2, 0, 2, 2},
                {2, 2, 0, 2, 0, 2, 2},
                {2, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 0, 2},
        };
        //print出路徑，道路是空字串，牆壁是█，勞贖是◇
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                if (maze[i][j] == 2 && j != 6) {
                    System.out.print("█");
                } else if (maze[i][j] == 2 && j == 6) {
                    System.out.println("█");
                } else if (maze[i][j] == 0 && j != 6) {
                    System.out.print(" ");
                } else if (maze[i][j] == 0 && j == 6) {
                    System.out.println(" ");//目前為止只印出了迷宮
                }

            }
        }
    }
}