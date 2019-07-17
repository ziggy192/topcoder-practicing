import java.util.*;
import java.math.*;
import static java.lang.Math.*;

//sai ngay test dau, array index out of bound ==" khi countnight > candles.length

public class OlympicCandles {
	
	public int numberOfNights(int[] candles) {
		int countNight = 0;
		boolean goodToGo = true;
		while (goodToGo) {
			countNight++;
			Arrays.sort(candles);
			if (countNight > candles.length) {
				goodToGo = false;
				countNight--;
				break;
			}
			//chekc if enough to count
			for (int i = 1; i <= countNight; i++) {
				candles[candles.length - i]--;
				if (candles[candles.length - i] < 0) {
					//not enoguth to light
					countNight--;
					goodToGo = false;
					return countNight;

				}
			}
			//else break;


		}

		return countNight;
	}
}
