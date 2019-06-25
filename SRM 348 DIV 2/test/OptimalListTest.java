import org.junit.Test;
import static org.junit.Assert.*;

public class OptimalListTest {
	
	@Test(timeout=2000)
	public void test0() {
		String inst = "NENENNWWWWWS";
		assertEquals("NNNWWW", new OptimalList().optimize(inst));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String inst = "NNEESSWW";
		assertEquals("", new OptimalList().optimize(inst));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String inst = "NEWSNWESWESSEWSENSEWSEWESEWWEWEEWESSSWWWWWW";
		assertEquals("SSSSSSSSWWW", new OptimalList().optimize(inst));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String inst = "NENENE";
		assertEquals("EEENNN", new OptimalList().optimize(inst));
	}
}
