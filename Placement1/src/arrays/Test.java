package arrays;

public class Test {
	public static void main(String[] args) {
//		System.out.println(addBinary("1100", "01"));
		char grid[][] = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		System.out.println(numIslands(grid));
	}

	public static String addBinary(String a, String b) {
		Integer b_a = Integer.parseInt(a, 2);
		Integer b_b = Integer.parseInt(b, 2);
		int res = b_a + b_b;

		String b_res = Integer.toBinaryString(res);
		return b_res;
	}

	public static int numIslands(char[][] grid) {
		int count = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					count++;
					bfs(grid, i, j);
				}
			}
		}

		return count;
	}

	public static void bfs(char grid[][], int i, int j) {

		if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
			return;
		}
		grid[i][j] = '0';

		bfs(grid, i + 1, j);
		bfs(grid, i - 1, j);
		bfs(grid, i, j + 1);
		bfs(grid, i, j - 1);

	}
}
