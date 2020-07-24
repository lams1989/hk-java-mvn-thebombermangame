package com.lams1989.thebombermangame;

import junit.framework.TestCase;

public class BombermanTest extends TestCase {

	public void testReplaceChar() {
		String[] actual = new String[6];

		actual[0] = ".......";
		actual[1] = "...O...";
		actual[2] = "....O..";
		actual[3] = ".......";
		actual[4] = "OO.....";
		actual[5] = "OO.....";

		String[] expected = new String[6];

		expected[0] = ".......";
		expected[1] = "...*...";
		expected[2] = "....*..";
		expected[3] = ".......";
		expected[4] = "**.....";
		expected[5] = "**.....";

		Bomberman.replaceChars('O', '*', actual);

		for (int i = 0; i < expected.length; i++) {

			assertEquals(expected[i], actual[i]);

		}

	}

	public void testNeigborBombs() {
		String[] actual = new String[6];

		actual[0] = "OOOOOO.";
		actual[1] = "OOO.OOO";
		actual[2] = "OOOO.OO";
		actual[3] = "OOOOOOO";
		actual[4] = "..OOOOO";
		actual[5] = "..OOOO.";

		String[] expected = new String[6];

		expected[0] = "OOO.O..";
		expected[1] = "OO...O.";
		expected[2] = "OOO...O";
		expected[3] = "..OO.OO";
		expected[4] = "...OOO.";
		expected[5] = "...OO..";

		Bomberman.explotedNeiBomb(actual);
		for (int i = 0; i < expected.length; i++) {

			assertEquals(expected[i], actual[i]);
		}
	}

	public void testBomberMan() {

		String[] result = new String[6];

		String[] grid = new String[6];

		grid[0] = ".......";
		grid[1] = "...O...";
		grid[2] = "....O..";
		grid[3] = ".......";
		grid[4] = "OO.....";
		grid[5] = "OO.....";

		String[] expected = new String[6];

		expected[0] = "OOO.OOO";
		expected[1] = "OO...OO";
		expected[2] = "OOO...O";
		expected[3] = "..OO.OO";
		expected[4] = "...OOOO";
		expected[5] = "...OOOO";

		result = Bomberman.bomberMan(grid, 3);
		for (int i = 0; i < result.length; i++) {
			assertEquals(expected[i], result[i]);
		}
	}

}
