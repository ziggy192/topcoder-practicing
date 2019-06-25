import org.junit.Test;
import static org.junit.Assert.*;

public class FallingFactorialPowerTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 7;
		int k = 3;
		assertEquals(210.0, new FallingFactorialPower().compute(n, k), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 10;
		int k = 1;
		assertEquals(10.0, new FallingFactorialPower().compute(n, k), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 5;
		int k = 0;
		assertEquals(1.0, new FallingFactorialPower().compute(n, k), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 3;
		int k = -1;
		assertEquals(0.25, new FallingFactorialPower().compute(n, k), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 2;
		int k = -3;
		assertEquals(0.016666666666666666, new FallingFactorialPower().compute(n, k), 1e-9);
	}
}
