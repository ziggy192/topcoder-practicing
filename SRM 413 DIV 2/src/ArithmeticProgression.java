import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ArithmeticProgression {
	
	public double minCommonDifference(int a0, int[] seq) {
		double minD = Double.MAX_VALUE;
		for (int i = 0; i < seq.length; i++) {
			double d = ((double) seq[i] - a0) / (i + 1);


			//test d
			boolean testResult = true;
			for (int j = 0; j < seq.length; j++) {
				if (Math.floor(a0 + (j + 1) * d) != seq[j]) {
					testResult = false;
					break;
				}
			}

			if (testResult && d < minD && d>=0) {
				minD = d;
			}

		}


		if (seq.length == 0) {
			return 0;
		}
		if (minD == Double.MAX_VALUE) {
			return -1;
		}

		return minD;
	}


}
