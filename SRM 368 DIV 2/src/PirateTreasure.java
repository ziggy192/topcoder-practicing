import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PirateTreasure {
	
	public double getDistance(int[] steps, String[] directions) {
		HashMap<String, Double> directionMapX = new HashMap<>();
		HashMap<String, Double> directionMapY = new HashMap<>();
		double cross = Math.sqrt(2) / 2;
		directionMapX.put("NORTH", 0d);
		directionMapX.put("SOUTH", 0d);
		directionMapX.put("EAST", 1d);
		directionMapX.put("WEST", -1d);
		directionMapX.put("NORTHWEST", -cross);
		directionMapX.put("NORTHEAST", cross);
		directionMapX.put("SOUTHWEST", -cross);
		directionMapX.put("SOUTHEAST", cross);

		directionMapY.put("NORTH", 1d);
		directionMapY.put("SOUTH", -1d);
		directionMapY.put("EAST", 0d);
		directionMapY.put("WEST", 0d);
		directionMapY.put("NORTHWEST", cross);
		directionMapY.put("NORTHEAST", cross);
		directionMapY.put("SOUTHWEST", -cross);
		directionMapY.put("SOUTHEAST", -cross);

		double curX  = 0;
		double curY = 0;
		for (int i = 0; i < steps.length; i++) {
			curX += directionMapX.get(directions[i])*steps[i];
			curY += directionMapY.get(directions[i])*steps[i];
		}


		return Math.sqrt(Math.pow(curX,2) + Math.pow(curY,2));
	}
}
