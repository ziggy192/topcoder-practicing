import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CarBuyer {
	
	public double lowestCost(String[] cars, int fuelPrice, int annualDistance, int years) {
		double minPrice = -1;
		for (String car : cars) {

			double calculatePrice = calculatePrice(car, fuelPrice, annualDistance, years);
				if (minPrice == -1 || minPrice > calculatePrice) {
					minPrice = calculatePrice;
			}
		}
		return minPrice;

	}

	private double calculatePrice(String car, int fuelPrice, int annualDistance, int years ) {

		double result = 0;
		String[] factors = car.split(" ");
		int cost = Integer.parseInt(factors[0]);
		int tax = Integer.parseInt(factors[1]);
		int fuelEfficency = Integer.parseInt(factors[2]);

		result += cost;
		double fuelCost = (double)fuelPrice * annualDistance / fuelEfficency;
		result += fuelCost*years;
		result += tax * years;
		return result;


	}

}
