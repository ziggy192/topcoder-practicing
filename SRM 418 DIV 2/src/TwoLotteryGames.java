import java.util.*;
import java.math.*;
import static java.lang.Math.*;


//sai do viet thua` dieu kien @@
public class TwoLotteryGames {

	int fac[] = new int[10];
	public double getHigherChanceGame(int n, int m, int k) {
		buildFactorial();
		int startK = max(2 * m - n, 1);

		long count = 0;
		for (int i = Math.max(startK,k); i <= m; i++) {
			count = count + cal(m, n) * cal(i, m) * cal(m - i, n - m);
		}
		return (double)count/ (cal(m,n)*cal(m,n));
	}

	private void buildFactorial() {
		fac[0] = 1;
		for (int i = 1; i <=8 ; i++) {
			fac[i] = fac[i - 1] * i;

		}
	}

	private long cal(int k, int n) {
		return fac[n] / (fac[k] * fac[n - k]);
	}


}
