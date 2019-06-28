import org.junit.Test;
import static org.junit.Assert.*;

public class FactoVisorsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] divisors = new int[] {1};
		int[] multiples = new int[] {100};
		assertEquals(9, new FactoVisors().getNum(divisors, multiples));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] divisors = new int[] {6,9};
		int[] multiples = new int[] {18};
		assertEquals(1, new FactoVisors().getNum(divisors, multiples));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] divisors = new int[] {6,9};
		int[] multiples = new int[] {96,180};
		assertEquals(0, new FactoVisors().getNum(divisors, multiples));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] divisors = new int[] {2,4};
		int[] multiples = new int[] {256};
		assertEquals(7, new FactoVisors().getNum(divisors, multiples));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] divisors = new int[] {1000,10000,100000};
		int[] multiples = new int[] {1000000000};
		assertEquals(25, new FactoVisors().getNum(divisors, multiples));
	}
}
