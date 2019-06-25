import org.junit.Test;
import static org.junit.Assert.*;

public class DistanceBetweenStringsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String a = "topcoder";
		String b = "contest";
		String letterSet = "tcp";
		assertEquals(2, new DistanceBetweenStrings().getDistance(a, b, letterSet));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String a = "abcdef";
		String b = "fedcba";
		String letterSet = "fed";
		assertEquals(0, new DistanceBetweenStrings().getDistance(a, b, letterSet));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String a = "aaaaa";
		String b = "bbbbb";
		String letterSet = "a";
		assertEquals(25, new DistanceBetweenStrings().getDistance(a, b, letterSet));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String a = "aaAaB";
		String b = "BbaAa";
		String letterSet = "ab";
		assertEquals(2, new DistanceBetweenStrings().getDistance(a, b, letterSet));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String a = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String b = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
		String letterSet = "ba";
		assertEquals(5000, new DistanceBetweenStrings().getDistance(a, b, letterSet));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String a = "ToPcOdEr";
		String b = "tOpCoDeR";
		String letterSet = "wxyz";
		assertEquals(0, new DistanceBetweenStrings().getDistance(a, b, letterSet));
	}
}
