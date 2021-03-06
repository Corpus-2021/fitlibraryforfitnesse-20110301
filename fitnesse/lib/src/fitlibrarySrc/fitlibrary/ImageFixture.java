/*
 * Copyright (c) 2006 Rick Mugridge, www.RimuResearch.com
 * Released under the terms of the GNU General Public License version 2 or later.
*/
package fitlibrary;

import fitlibrary.parser.graphic.ImageNameGraphic;

/**
  * Checks that the table of images matches the 2D array supplied.
 */
public class ImageFixture extends GridFixture {
	public ImageFixture(String[][] actualFileNames) {
		super();
		ImageNameGraphic[][] grid = new ImageNameGraphic[actualFileNames.length][];
		for (int r = 0; r < actualFileNames.length; r++) {
			grid[r] = new ImageNameGraphic[actualFileNames[r].length];
			for (int c = 0; c < actualFileNames[r].length; c++)
				grid[r][c] = new ImageNameGraphic(actualFileNames[r][c]);
		}
		setGrid(grid);
	}
}
