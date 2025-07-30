package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int min = 0, fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if(grid[i][j] == 1){
                    fresh++;
                }

            }
        }

        int[][] directions = {{0, -1}, {-1, 0},
                {0, 1}, {1, 0}};

        while(!q.isEmpty() && fresh > 0){
            int size = q.size();
            boolean flag = false;
            for(int i = 0; i < size; i++){
                int[] node = q.poll();
                int row = node[0];
                int col = node[1];
                for(int[] dir: directions){
                    int r = row + dir[0];
                    int c = col + dir[1];
                    if(r >= 0 && c >= 0 && r < m && c < n && grid[r][c] == 1){
                        grid[r][c] = 2;
                        q.add(new int[]{r, c});
                        fresh--;
                        flag = true;
                    }
                }
            }
            if(flag)
                min++;
        }

        return fresh == 0? min: -1;
    }
}
