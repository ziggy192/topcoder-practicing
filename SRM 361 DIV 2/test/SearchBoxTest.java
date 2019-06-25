import org.junit.Test;
import static org.junit.Assert.*;

public class SearchBoxTest {
	
	@Test(timeout=2000)
	public void test0() {
		String text = "We dont need no education";
		String search = "ed";
		String wholeWord = "N";
		int start = 13;
		assertEquals(16, new SearchBox().find(text, search, wholeWord, start));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String text = "We dont need no thought control";
		String search = "We";
		String wholeWord = "Y";
		int start = 0;
		assertEquals(0, new SearchBox().find(text, search, wholeWord, start));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String text = "No dark sarcasm in the classroom";
		String search = "The";
		String wholeWord = "Y";
		int start = 5;
		assertEquals(-1, new SearchBox().find(text, search, wholeWord, start));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String text = "Teachers leave them kids alone";
		String search = "kid";
		String wholeWord = "Y";
		int start = 1;
		assertEquals(-1, new SearchBox().find(text, search, wholeWord, start));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String text = "All in all its just another brick in the wall";
		String search = "all";
		String wholeWord = "Y";
		int start = 9;
		assertEquals(-1, new SearchBox().find(text, search, wholeWord, start));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String text = "All in all youre just another brick in the wall";
		String search = "just";
		String wholeWord = "Y";
		int start = 17;
		assertEquals(17, new SearchBox().find(text, search, wholeWord, start));
	}
}
