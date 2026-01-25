package gr.aueb.cf.cf9.ch06;

public class ArrayTwoDim {
    public static void main(String[] args) {
        int[][] grid = new int[2][3];
        int[][] grid2 = {
                {1, 2, 4},
                {5, 6, 7}
        };
    grid [0][0]=1;
    grid [0][1]=2;
    grid [0][2]=4;
    grid [1][0]=5;
    grid [1][1]=6;
    grid [1][2]=7;
    for (int i = 0; i < grid.length;i++) {
        for (int j = 0; j < grid[i].length; j++) {
            System.out.print(grid[i][j] + " ");
        }
        System.out.println();
    }
}
}
