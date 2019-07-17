import org.junit.Test;
import static org.junit.Assert.*;

public class OrderedSuperStringTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] words = new String[] {"abc","ca"};
		assertEquals(4, new OrderedSuperString().getLength(words));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] words = new String[] {"a","a","b","a"};
		assertEquals(3, new OrderedSuperString().getLength(words));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] words = new String[] {"abcdef", "ab","bc", "de","ef"};
		assertEquals(6, new OrderedSuperString().getLength(words));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] words = new String[] {"ab","bc", "de","ef","abcdef"};
		assertEquals(12, new OrderedSuperString().getLength(words));
	}

	@Test(timeout=2000)
	public void test4() {
		String[] words = new String[] {"aaaaaaaaaaabaaaaaaaa", "bac", "aaaabacaaa", "ab", "ba", "a", "ca"};
		assertEquals(33, new OrderedSuperString().getLength(words));
	}
}
