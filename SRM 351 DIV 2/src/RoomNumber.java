import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RoomNumber {
	
	public int numberOfSets(int roomNumber) {
		String s = "" + roomNumber;
		// TODO: 6/24/19 count 69
		char[] chars = s.toCharArray();
		int[] countNum = new int[9];
		for (char aChar : chars) {
			if (aChar == '6' || aChar == '9') {
				countNum[6]++;
			} else {
				countNum[aChar - '0']++;
			}

		}

		countNum[6] = (int)Math.ceil((double)(countNum[6] / 2));

		int max = 0;
		for (int i : countNum) {
			if (i > max) {

				max = i;
			}
		}


		return max;
	}

}
