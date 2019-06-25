import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ThrowTheBall {
	
	public int timesThrown(int N, int M, int L) {
		int[] a = new int[N];
		a[0] = 1;
		int turns = 0;
		int currentIndex = 0;
		while (a[currentIndex]<M) {
			if (a[currentIndex] % 2 == 0) {
				//even
				currentIndex += L;


			} else {
				//odd
				currentIndex -= L;
			}

			currentIndex %= N;
			if (currentIndex < 0) {
				currentIndex += N;
			}
			a[currentIndex]=a[currentIndex]+1;
			turns++;

		}
		return turns;
	}
}
