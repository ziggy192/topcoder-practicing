import org.junit.Test;
import static org.junit.Assert.*;

public class ReversedSumTest {
	
	@Test(timeout=2000)
	public void test0() {
		int x = 123;
		int y = 100;
		assertEquals(223, new ReversedSum().getReversedSum(x, y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int x = 111;
		int y = 111;
		assertEquals(222, new ReversedSum().getReversedSum(x, y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int x = 5;
		int y = 5;
		assertEquals(1, new ReversedSum().getReversedSum(x, y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int x = 1000;
		int y = 1;
		assertEquals(2, new ReversedSum().getReversedSum(x, y));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int x = 456;
		int y = 789;
		assertEquals(1461, new ReversedSum().getReversedSum(x, y));
	}
}
