import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Embassy {
	
	public int visaApplication(int[] forms, int dayLength, int openTime) {

		int minTime = Integer.MAX_VALUE;

		for (int startTime = 0; startTime < dayLength; startTime++) {
			int currentTime = startTime;
			for (int i = 0; i < forms.length; i++) {
				int form = forms[i];
				currentTime += form;
				//wait til next
				if (currentTime % dayLength > openTime) {
					currentTime = ((currentTime / dayLength) + 1) * dayLength;

				}
			}

			if (currentTime - startTime < minTime) {
				minTime = currentTime - startTime;
			}


		}
		return minTime;
	}
}
