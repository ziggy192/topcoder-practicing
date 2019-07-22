import org.junit.Test;
import static org.junit.Assert.*;

public class TemplateMatchingTest {
	
	@Test(timeout=2000)
	public void test0() {
		String text = "something";
		String prefix = "awesome";
		String suffix = "ingenious";
		assertEquals("something", new TemplateMatching().bestMatch(text, prefix, suffix));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String text = "havka";
		String prefix = "eto";
		String suffix = "papstvo";
		assertEquals("a", new TemplateMatching().bestMatch(text, prefix, suffix));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String text = "abracadabra";
		String prefix = "habrahabr";
		String suffix = "bracket";
		assertEquals("abrac", new TemplateMatching().bestMatch(text, prefix, suffix));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String text = "mississippi";
		String prefix = "promise";
		String suffix = "piccolo";
		assertEquals("ippi", new TemplateMatching().bestMatch(text, prefix, suffix));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String text = "a a a a a a";
		String prefix = "a a";
		String suffix = "a";
		assertEquals("a a", new TemplateMatching().bestMatch(text, prefix, suffix));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String text = "ab";
		String prefix = "b";
		String suffix = "a";
		assertEquals("b", new TemplateMatching().bestMatch(text, prefix, suffix));
	}
}
