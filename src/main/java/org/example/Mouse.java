package org.example;

public class Mouse {
    static int[][] maze = {//勞贖會從(1,0)走到(6,5)
            {2, 2, 2, 2, 2, 2, 2},
            {0, 0, 0, 0, 0, 0, 2},
            {2, 0, 2, 0, 2, 0, 2},
            {2, 0, 0, 2, 0, 2, 2},
            {2, 2, 0, 2, 0, 2, 2},
            {2, 0, 0, 0, 0, 0, 2},
            {2, 2, 2, 2, 2, 0, 2},
    };

    public static void main(String[] args) {
        mouseGo(1,0);

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

    public static boolean mouseGo(int i, int j) {//讓老鼠走迷宮，經過的可行路線值改為1
        return false;
    }
}
