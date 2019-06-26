import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MirroredClock {
	
	public String whatTimeIsIt(String time) {

		String[] split = time.split(":");
		int hour = Integer.parseInt(split[0]);
		int minutes = Integer.parseInt(split[1]);
		hour = inverse(hour, 12);
		minutes = inverse(minutes, 60);
		if (minutes != 0) {
			hour--;
		}

		return String.format("%02d:%02d", hour,minutes);
	}

	private int inverse(int value, int module) {
		value *= -1;
		value = value % module;
		if (value < 0) {
			value += module;
		}
		return value;
	}
}
