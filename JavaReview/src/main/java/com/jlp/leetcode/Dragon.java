package com.jlp.leetcode;

class Dragon {

    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;
        int[][] dungeonCopy = new int[n][m];
        int res = calculateMinimumHPDfs(dungeon, 0, 0, dungeonCopy);
        return res;
    }

    int[][] dir = new int[][] {
            new int[] {0, 1},
            new int[] {1, 0}
    };


    /**
     * 深度遍历，每个钻取时，带上当前最低血量要求，最终返回最大的最低血量要求
     *
     * @param dungeon
     * @param nstart
     * @param mstart
     * @return
     */
    public int calculateMinimumHPDfs(int[][] dungeon, int nstart, int mstart, int[][] dungeonCopy) {
        int n = dungeon.length;
        int m = dungeon[0].length;
        if (nstart >= n || mstart >= m) {
            return Integer.MAX_VALUE;
        }
        if (0 != dungeonCopy[nstart][mstart]) {
            return dungeonCopy[nstart][mstart];
        }
        int nowVal = dungeon[nstart][mstart];
        if (nstart == n - 1 && mstart == m - 1) {
            return Math.max(1 - nowVal, 1);
        }
        int resR = calculateMinimumHPDfs(dungeon, nstart + dir[0][0], mstart + dir[0][1], dungeonCopy);
        int resD = calculateMinimumHPDfs(dungeon, nstart + dir[1][0], mstart + dir[1][1], dungeonCopy);
        dungeonCopy[nstart][mstart] = Math.max(Math.min(resD, resR) - nowVal, 1);
        return dungeonCopy[nstart][mstart];
    }

    public static void main(String[] args) {
        int[][] test = new int[][] {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        System.out.println(new Dragon().calculateMinimumHP(test));
    }

}