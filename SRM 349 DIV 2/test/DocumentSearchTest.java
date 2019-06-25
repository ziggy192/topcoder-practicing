import org.junit.Test;
import static org.junit.Assert.*;

public class DocumentSearchTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] doc = new String[] {"ababababa"};
		String search = "ababa";
		assertEquals(1, new DocumentSearch().nonIntersecting(doc, search));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] doc = new String[] {"ababababa"};
		String search = "aba";
		assertEquals(2, new DocumentSearch().nonIntersecting(doc, search));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] doc = new String[] {"abcdefghijklmnop",
 "qrstuvwxyz"};
		String search = "pqrs";
		assertEquals(1, new DocumentSearch().nonIntersecting(doc, search));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] doc = new String[] {"aaa", "aa", "a", "a"};
		String search = "aa";
		assertEquals(3, new DocumentSearch().nonIntersecting(doc, search));
	}
}
