package com.lams1989.thebombermangame;


public class App {

	public static void main(String[] args) {
		int r = 6; //filas

		//int c = 7; //colom

		int n = 6; //segundos
		String[] result = new String[r];

		String[] grid = new String[r];

		grid[0] = ".......";
		grid[1] = "...O...";
		grid[2] = "....O..";
		grid[3] = ".......";
		grid[4] = "OO.....";
		grid[5] = "OO.....";

		result= Bomberman.bomberMan(grid, n);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);

		}

	}
}
