import org.junit.Test;
import static org.junit.Assert.*;

public class NextNumberTest {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 1717;
		assertEquals(1718, new NextNumber().getNextNumber(N));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 4;
		assertEquals(8, new NextNumber().getNextNumber(N));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 7;
		assertEquals(11, new NextNumber().getNextNumber(N));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int N = 12;
		assertEquals(17, new NextNumber().getNextNumber(N));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int N = 555555;
		assertEquals(555557, new NextNumber().getNextNumber(N));
	}
}
