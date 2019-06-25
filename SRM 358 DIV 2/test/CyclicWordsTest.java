import org.junit.Test;
import static org.junit.Assert.*;

public class CyclicWordsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] words = new String[] { "picture", "turepic", "icturep", "word", "ordw" };
		assertEquals(2, new CyclicWords().differentCW(words));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] words = new String[] { "ast", "ats", "tas", "tsa", "sat", "sta", "ttt" };
		assertEquals(3, new CyclicWords().differentCW(words));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] words = new String[] {"aaaa", "aaa", "aa", "aaaa", "aaaaa"};
		assertEquals(4, new CyclicWords().differentCW(words));
	}
}
