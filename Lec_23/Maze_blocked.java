package Lec_23;

public class Maze_blocked {
	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		boolean[][] path = new boolean[maze.length][maze[0].length];
		path(0, 0, maze, "", path);
	}

	public static void path(int r, int c, int[][] arr, String ans, boolean[][] path) {

		if (r < 0 || c < 0 || r == arr.length || c == arr[0].length || arr[r][c] == 1 || path[r][c]) {
			return;
		}

		if (r == arr.length - 1 && c == arr[0].length - 1) {
			System.out.println(ans);
			return;
		}
		path[r][c] = true;
//		System.out.println(ans);
		path(r + 1, c, arr, ans + "D", path); // Down
		path(r - 1, c, arr, ans + "U", path); // Up

		path(r, c + 1, arr, ans + "R", path); // Right
		path(r, c - 1, arr, ans + "L", path); // Left
		path[r][c] = false;		
	}
}
