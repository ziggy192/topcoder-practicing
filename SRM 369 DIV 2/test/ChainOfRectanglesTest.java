import org.junit.Test;
import static org.junit.Assert.*;

public class ChainOfRectanglesTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] width = new int[] {10000};
		int[] height = new int[] {10000};
		String color = "R";
		assertEquals(100000000, new ChainOfRectangles().getMaximalArea(width, height, color));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] width = new int[] {10, 5};
		int[] height = new int[] {10, 5};
		String color = "GB";
		assertEquals(75, new ChainOfRectangles().getMaximalArea(width, height, color));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] width = new int[] {10, 9};
		int[] height = new int[] {8, 7};
		String color = "GB";
		assertEquals(63, new ChainOfRectangles().getMaximalArea(width, height, color));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] width = new int[] {10, 8, 6, 4, 2};
		int[] height = new int[] {9, 7, 5, 3, 1};
		String color = "GBRRG";
		assertEquals(36, new ChainOfRectangles().getMaximalArea(width, height, color));
	}
}
