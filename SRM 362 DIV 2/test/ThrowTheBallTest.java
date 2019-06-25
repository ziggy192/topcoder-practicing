import org.junit.Test;
import static org.junit.Assert.*;

public class ThrowTheBallTest {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 5;
		int M = 3;
		int L = 2;
		assertEquals(10, new ThrowTheBall().timesThrown(N, M, L));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 4;
		int M = 1;
		int L = 3;
		assertEquals(0, new ThrowTheBall().timesThrown(N, M, L));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 10;
		int M = 3;
		int L = 5;
		assertEquals(4, new ThrowTheBall().timesThrown(N, M, L));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int N = 15;
		int M = 4;
		int L = 9;
		assertEquals(15, new ThrowTheBall().timesThrown(N, M, L));
	}
}
