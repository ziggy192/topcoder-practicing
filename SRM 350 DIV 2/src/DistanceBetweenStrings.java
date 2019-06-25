import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DistanceBetweenStrings {
	
	public int getDistance(String a, String b, String letterSet) {

		char[] aChars = a.toLowerCase().toCharArray();
		char[] bChars = b.toLowerCase().toCharArray();
		int result = 0;
		for (char c : letterSet.toCharArray()) {
			int n1 = 0;
			for (int i = 0; i < aChars.length; i++) {
				if (aChars[i] == c) {
					n1++;
				}

			}

			int n2 = 0;
			for (int i = 0; i < bChars.length; i++) {
				if (bChars[i] == c) {
					n2++;
				}

			}
			result += (n1 - n2) * (n1 - n2);

		}
		return result;
	}
}
