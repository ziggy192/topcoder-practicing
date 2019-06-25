import org.junit.Test;
import static org.junit.Assert.*;

public class CarBuyerTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] cars = new String[] {"10000 50 50","12000 500 10","15000 100 65","20000 20 80","25000 10 90"};
		int fuelPrice = 2;
		int annualDistance = 5000;
		int years = 2;
		assertEquals(10500.0, new CarBuyer().lowestCost(cars, fuelPrice, annualDistance, years), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] cars = new String[] {"10000 50 50","12000 500 10","15000 100 65","20000 20 80","25000 10 90"};
		int fuelPrice = 8;
		int annualDistance = 25000;
		int years = 10;
		assertEquals(45200.0, new CarBuyer().lowestCost(cars, fuelPrice, annualDistance, years), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] cars = new String[] {"8426 774 19","29709 325 31","30783 853 68","20796 781 3"
,"27726 4 81","20788 369 69","17554 359 34","12039 502 24"
,"6264 230 69","14151 420 65","25115 528 70","22234 719 55"
,"2050 926 40","18618 714 29","173 358 57"};
		int fuelPrice = 33;
		int annualDistance = 8673;
		int years = 64;
		assertEquals(254122.44444444444, new CarBuyer().lowestCost(cars, fuelPrice, annualDistance, years), 1e-9);
	}
}
