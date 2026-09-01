package lec_24;

import java.util.Scanner;

public class Ques_2_Rat_Chases {

	static int val = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < m; j++) {
				maze[i][j] = str.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		path(maze, 0, 0, ans);
		if (val == 0) {
			System.out.println("NO PATH FOUND");
		}

	}

	public static void path(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			ans[cr][cc] = 1; // last vale ki value set kr rhe h
			display(ans);
			return;
		}
		maze[cr][cc] = 'X'; // temporary blocking, to stop infinity recursion
		ans[cr][cc] = 1; // maintain the answer
		int[] r = {-1,0, 1, 0};
		int[] c = {0, -1, 0, 1};
		for(int i=0; i<c.length; i++) {
			path(maze, cr+r[i], cc+c[i], ans);
		}
		//path(maze, cr - 1, cc, ans);// up
		//path(maze, cr, cc - 1, ans);// left
		//path(maze, cr + 1, cc, ans);// down
		//path(maze, cr, cc + 1, ans);// right
		maze[cr][cc] = '0'; // unblock
		ans[cr][cc] = 0; //

	}

	public static void display(int[][] ans) {
		val = 1;
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
