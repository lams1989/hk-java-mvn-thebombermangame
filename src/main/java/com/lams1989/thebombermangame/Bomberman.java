package com.lams1989.thebombermangame;

public class Bomberman {

	public static String[] bomberMan(String[] grid, int n) {
		for (int t = 2; t <= n; t++) {

			if (t % 2 == 0) {
				replaceChars('O', '*', grid);
				replaceChars('.', 'O', grid);
			}
			if (t % 2 == 1) {
				replaceChars('*', '.', grid);
				explotedNeiBomb(grid);
			}

		}

		return grid;
	}

	public static void replaceChars(char oldChar, char newChar, String[] grid) {
		for (int i = 0; i < grid.length; i++) {
			grid[i] = grid[i].replace(oldChar, newChar);

		}
	}

	public static void explotedNeiBomb(String[] grid) {
		int row = grid.length;
		int colum = grid[0].length();

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[i].length(); j++) {

				char bomb = grid[i].charAt(j);

				if (bomb == '.') {

					if (i - 1 >= 0) {
						String up = grid[i - 1];
						char[] charArray = up.toCharArray();
						if (charArray[j] != '.') {
							charArray[j] = 'x';
						}
						grid[i - 1] = new String(charArray);
					}
					if (i + 1 < row) {
						String down = grid[i + 1];
						char[] charArray = down.toCharArray();
						if (charArray[j] != '.') {
							charArray[j] = 'x';
						}
						grid[i + 1] = new String(charArray);
					}
					if (j - 1 >= 0) {
						String left = grid[i];
						char[] charArray = left.toCharArray();
						if (charArray[j - 1] != '.') {
							charArray[j - 1] = 'x';
						}
						grid[i] = new String(charArray);
					}
					if (j + 1 < colum) {
						String rigth = grid[i];
						char[] charArray = rigth.toCharArray();
						if (charArray[j + 1] != '.') {
							charArray[j + 1] = 'x';
						}
						grid[i] = new String(charArray);
					}
				}
			}
		}
		replaceChars('x', '.', grid);

	}

	
}
