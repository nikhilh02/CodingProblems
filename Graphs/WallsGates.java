package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class WallsGates {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0)
                    q.add(new int[]{i, j});
            }
        }

        if(q.size() == 0)
            return;

        int[][] directions = {{0, -1}, {-1, 0},
                {0, 1}, {1, 0}};

        while(!q.isEmpty()){
            int[] node = q.poll();
            int row = node[0];
            int col = node[1];
            for(int[] dir: directions){
                int r = row + dir[0];
                int c = col + dir[1];
                if(r < 0 || c < 0 || r >= m || c >= n ||
                        grid[r][c] != Integer.MAX_VALUE) {
                    continue;
                }

                q.add(new int[] {r, c});
                grid[r][c] = grid[row][col] + 1;
            }
        }
    }
}
