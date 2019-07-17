import org.junit.Test;
import static org.junit.Assert.*;

public class ArithmeticProgressionTest {
	
	@Test(timeout=2000)
	public void test0() {
		int a0 = 0;
		int[] seq = new int[] {6, 13, 20, 27};
		assertEquals(6.75, new ArithmeticProgression().minCommonDifference(a0, seq), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int a0 = 1;
		int[] seq = new int[] {2, 3, 4, 5, 6};
		assertEquals(1.0, new ArithmeticProgression().minCommonDifference(a0, seq), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int a0 = 3;
		int[] seq = new int[] {};
		assertEquals(0.0, new ArithmeticProgression().minCommonDifference(a0, seq), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int a0 = 3;
		int[] seq = new int[] {3, 3, 3, 3, 4};
		assertEquals(0.2, new ArithmeticProgression().minCommonDifference(a0, seq), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		int a0 = 1;
		int[] seq = new int[] {-3};
		assertEquals(-1.0, new ArithmeticProgression().minCommonDifference(a0, seq), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test5() {
		int a0 = 0;
		int[] seq = new int[] {6, 14};
		assertEquals(-1.0, new ArithmeticProgression().minCommonDifference(a0, seq), 1e-9);
	}
}
