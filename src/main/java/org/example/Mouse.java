package org.example;

import org.junit.jupiter.api.Test;

public class Mouse {

    public static void main(String[] args) {
        int[][] maze = { //勞贖會從(1,0)走到(6,5) 老鼠會轉彎
                {2, 2, 2, 2, 2, 2, 2},
                {0, 0, 0, 0, 0, 0, 2},
                {2, 0, 2, 0, 2, 0, 2},
                {2, 0, 0, 2, 0, 2, 2},
                {2, 2, 0, 2, 0, 2, 2},
                {2, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 0, 2},
        };
        //讓老鼠走迷宮，經過的可行路線值改為1

        //print出路徑，道路是空字串，牆壁是█，勞贖是◇
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] == 2 && j != 6) {
                    System.out.print("█");
                } else if (maze[i][j] == 2 && j == 6) {
                    System.out.println("█");
                } else if (maze[i][j] == 0 && j != 6) {
                    System.out.print(" ");
                } else if (maze[i][j] == 0 && j == 6) {
                    System.out.println(" ");
                } else if (maze[i][j] == 1) {
                    System.out.print("◇");
                }

            }
        }
    }
    public boolean mouseGo(){
        return false;
    }
}
