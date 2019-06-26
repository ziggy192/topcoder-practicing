import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class WhiteCells {
	
	public int countOccupied(String[] board) {
		int count = 0;

		for (int row = 0; row < board.length; row++) {
			char[] cellsInRow = board[row].toCharArray();
			for (int column = 0; column < cellsInRow.length; column++) {
				if (cellsInRow[column] == 'F') {
					if ((row + column) % 2 == 0) {
						count++;
					}
				}
			}
		}

		return count;
	}
}
