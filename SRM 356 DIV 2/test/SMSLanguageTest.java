import org.junit.Test;
import static org.junit.Assert.*;

public class SMSLanguageTest {
	
	@Test(timeout=2000)
	public void test0() {
		String text = "I HATE rats, and you?";
		assertEquals("i h8 r@s & U", new SMSLanguage().translate(text));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String text = "What is the weather like today?";
		assertEquals("wh@ is the we@her like today", new SMSLanguage().translate(text));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String text = "It is not too late to..";
		assertEquals("it is not too l8 to", new SMSLanguage().translate(text));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String text = "this text is already in sms language";
		assertEquals("this text is already in sms language", new SMSLanguage().translate(text));
	}
}
