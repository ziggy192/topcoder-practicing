import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class OlympicCandles {
	
	public int numberOfNights(int[] candles) {
		int countNight = 0;
		boolean goodToGo = true;
		while (goodToGo) {
			countNight++;
			Arrays.sort(candles);

			//chekc if enought to count
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
