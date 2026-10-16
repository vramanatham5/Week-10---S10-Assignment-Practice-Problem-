public class Question5 {
    public static int[] busiestRow(int[][] grid) {
        int busiestIndex = 0;
        int busiestTotal = -1;

        for (int row = 0; row < grid.length; row++) {
            int total = 0;
            for (int students : grid[row]) {
                total += students;
            }

            if (total > busiestTotal) {
                busiestIndex = row;
                busiestTotal = total;
            }
        }

        return new int[] {busiestIndex, busiestTotal};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 1},
            {3, 3, 1},
            {1, 1, 1}
        };
        int[] result = busiestRow(grid);
        System.out.println("Row " + result[0] + ", Total " + result[1]);
    }
}
