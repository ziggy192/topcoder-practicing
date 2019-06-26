import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ChainOfRectangles {
	
	public int getMaximalArea(int[] width, int[] height, String color) {
		// 						R G B
		int[] area = new int[]{0, 0, 0};
		char previousColor = ' ';
		for (int i = 0; i < width.length; i++) {
			char c = color.charAt(i);

			area[toIndexArea(c)]+= width[i] * height[i];
			if (previousColor != ' ') {
				area[toIndexArea(previousColor)] -= width[i] * height[i];
			}

			previousColor = c;

		}

		int max = 0;
		for (int i : area) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	private int toIndexArea(char color) {
		switch (color) {
			case 'R':
				return 0;
			case 'G':
				return 1;
			case 'B':
				return 2;
		}
		return 0;
	}

}
