import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FallingFactorialPower {
	
	public double compute(int n, int k) {
		double result = 1;
		if (k > 0) {
			for (int i = n; i >= n - k + 1; i--) {
				result = result * i;
			}
		} else if (k < 0) {
			k*=-1;
			for (int i = n+1; i <= n+k; i++) {
				result = result / i;
			}
		}
		return result;
	}
}
