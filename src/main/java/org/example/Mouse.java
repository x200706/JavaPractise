package org.example;

public class Mouse {
    private static int[][] maze = {
            //根據書上的指示，勞贖會從(1,0)走到(6,5)
            {2, 2, 2, 2, 2, 2, 2},
            {0, 0, 0, 0, 0, 0, 2},
            {2, 0, 2, 0, 2, 0, 2},
            {2, 0, 0, 2, 0, 2, 2},
            {2, 2, 0, 2, 0, 2, 2},
            {2, 0, 0, 0, 0, 0, 2},
            {2, 2, 2, 2, 2, 0, 2},
    };


    public static void main(String[] args) {
        if (!mouseGo(1, 0)) {//傳入本題勞贖的起點
            System.out.println("此迷宮無解");
        } else {
            //print出路徑，道路是空字串，牆壁是█，勞贖是◇
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[0].length; j++) {
                    if (maze[i][j] == 2) {
                        System.out.print("█");
                    } else if (maze[i][j] == 0) {
                        System.out.print(" ");
                    } else if (maze[i][j] == 1) {
                        System.out.print("◇");
                    }
                }
                System.out.println();
            }
        }
    }

    static boolean flag = false;

    public static boolean mouseGo(int i, int j) { //讓老鼠走迷宮，經過的可行路線值改為1
        //勞贖走過的地方，標記為1
        maze[i][j] = 1;

        //是否走完迷宮的註記
        if (i == 6 && j == 5) { //本題的出口為maze[6][5]
            return true;
        }

        //勞贖開始探索四個方位如果迷宮還沒走完，而且勞贖發現右邊為0即為有路
        if (!flag && j + 1 < maze[0].length && maze[i][j + 1] == 0) {
            //繼續走迷宮（遞迴）
            mouseGo(i, j + 1);//老鼠往右移一格
        } else if (!flag && i + 1 < maze.length && maze[i + 1][j] == 0) { //勞贖途中嘗試往下走的情況..
            mouseGo(i + 1, j);
        } else if (!flag && i - 1 >= 0 && maze[i - 1][j] == 0) { //勞贖途中嘗試往上走的情況..
            mouseGo(i - 1, j);
        } else if (!flag && j - 1 >= 0 && maze[i][j - 1] == 0) { //勞贖途中嘗試往左走的情況..
            mouseGo(i, j - 1);
        }

//        if (!flag) { //勞贖嘗試過無效退掉的道路，拔除路徑標記，恢復為道路0
//            maze[i][j] = 0;
//        }
        return flag;
    }
}
