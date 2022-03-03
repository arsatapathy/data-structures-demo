package com.arsatapathy.graph;

import java.util.HashSet;
import java.util.Set;

public class Island {
    public static void main(String... args) {

        char[][] grid = {
                {'W', 'L', 'W', 'W', 'W'},
                {'W', 'L', 'W', 'W', 'W'},
                {'W', 'W', 'W', 'L', 'W'},
                {'W', 'W', 'L', 'L', 'W'},
                {'L', 'W', 'W', 'L', 'L'},
                {'L', 'L', 'W', 'W', 'W'}
        };

        System.out.println("Island Count = " + islandCount(grid));
        System.out.println("Max Size Island = " + maxSizeIsland(grid));
    }

    public static int islandCount(char[][] grid) {
        int count = 0;
        Set<String> visited = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (isIsland(grid, i, j, visited)) {
                    count += 1;
                }
            }
        }

        return count;
    }

    public static boolean isIsland(char[][] grid, int row, int column, Set<String> visited) {
        boolean row_in_bound = row >= 0 && row < grid.length;
        boolean column_in_bound = column >= 0 && column < grid[0].length;

        if (!row_in_bound || !column_in_bound)
            return false;

        if (grid[row][column] == 'W')
            return false;

        if (visited.contains(row + "," + column))
            return false;
        else
            visited.add(row + "," + column);

        isIsland(grid, row - 1, column, visited);
        isIsland(grid, row + 1, column, visited);
        isIsland(grid, row, column - 1, visited);
        isIsland(grid, row, column + 1, visited);

        return true;
    }

    public static int maxSizeIsland(char[][] grid) {
        int max = Integer.MIN_VALUE;

        Set<String> visited = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, islandSize(grid, i, j, visited));
            }
        }

        return max;
    }

    public static int islandSize(char[][] grid, int row, int column, Set<String> visited) {
        boolean row_in_bound = row >= 0 && row < grid.length;
        boolean column_in_bound = column >= 0 && column < grid[0].length;

        if (!row_in_bound || !column_in_bound)
            return 0;

        if (grid[row][column] == 'W')
            return 0;

        if (visited.contains(row + "," + column))
            return 0;
        else
            visited.add(row + "," + column);

        int size = 1;

        size += islandSize(grid, row-1, column, visited);
        size += islandSize(grid, row+1, column, visited);
        size += islandSize(grid, row, column-1, visited);
        size += islandSize(grid, row, column+1, visited);

        return size;

    }
}