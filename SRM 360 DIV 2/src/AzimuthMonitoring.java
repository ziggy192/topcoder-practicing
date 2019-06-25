import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AzimuthMonitoring {
	
	public int getAzimuth(String[] instructions) {
		int result = 0;
		for (String instruction : instructions) {
			if (instruction.contains("HALT")) {
				break;
			} else if (instruction.contains("TURN AROUND")) {
				result += 180;
			} else {
				int value = 90;
				if (instruction.contains(" ")) {
					value = Integer.parseInt(instruction.split(" ")[1]);
				}
				if (instruction.contains("LEFT")) {
					value = value * -1;
				}
				result += value;
			}

		}
		while (result < 0) {
			result = result % 360 + 360;
		}
		return result % 360;
	}
}
