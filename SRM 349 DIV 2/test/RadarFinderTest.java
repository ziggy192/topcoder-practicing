import org.junit.Test;
import static org.junit.Assert.*;

public class RadarFinderTest {
	
	@Test(timeout=2000)
	public void test0() {
		int x1 = 0;
		int y1 = 0;
		int r1 = 13;
		int x2 = 40;
		int y2 = 0;
		int r2 = 37;
		assertEquals(2, new RadarFinder().possibleLocations(x1, y1, r1, x2, y2, r2));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int x1 = 0;
		int y1 = 0;
		int r1 = 3;
		int x2 = 0;
		int y2 = 7;
		int r2 = 4;
		assertEquals(1, new RadarFinder().possibleLocations(x1, y1, r1, x2, y2, r2));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int x1 = 0;
		int y1 = 0;
		int r1 = 5;
		int x2 = 10;
		int y2 = 10;
		int r2 = 3;
		assertEquals(0, new RadarFinder().possibleLocations(x1, y1, r1, x2, y2, r2));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int x1 = 0;
		int y1 = 0;
		int r1 = 1;
		int x2 = 0;
		int y2 = 0;
		int r2 = 1;
		assertEquals(-1, new RadarFinder().possibleLocations(x1, y1, r1, x2, y2, r2));
	}
}
