import org.junit.Test;
import static org.junit.Assert.*;

public class MorselikeCodeTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] library = new String[] {"O ---",
 "S ..."};
		String message = "... --- ...";
		assertEquals("SOS", new MorselikeCode().decrypt(library, message));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] library = new String[] {"O ---"};
		String message = "... --- ...";
		assertEquals("?O?", new MorselikeCode().decrypt(library, message));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] library = new String[] {"H -",
 "E .",
 "L --",
 "L ..",
 "O -."};
		String message = "- . -- .. -.";
		assertEquals("HELLO", new MorselikeCode().decrypt(library, message));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] library = new String[] {"H -.-.-.-.-.-.-.-.-.-.",
 "I .-.-.-.-.-.-.-.-.-.-",
 "K -.-.-.-.-.",
 "E .-.-.-.-.-"};
		String message = "-.-.-.-.-.-.-.-.-.-. .-.-.-.-.-.-.-.-.-.-";
		assertEquals("HI", new MorselikeCode().decrypt(library, message));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] library = new String[] {"O ---",
 "S ...",
 "B -...",
 "T -",
 "R .-.",
 "E .",
 "N -.",
 "X -..-",
 "D -.." };
		String message = "-... --- ... - --- -. .-. . -.. ... --- -..-";
		assertEquals("BOSTONREDSOX", new MorselikeCode().decrypt(library, message));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] library = new String[] {"B -...",
 "N -.",
 "H ....",
 "O --",
 "Z --..",
 "G ---",
 "I ..",
 "J .---" };
		String message = "--- -- -... .- -. .- -. .-";
		assertEquals("GOB?N?N?", new MorselikeCode().decrypt(library, message));
	}
	
	@Test(timeout=2000)
	public void test6() {
		String[] library = new String[] {"A --",
 "B -.",
 "N ...-",
 "I --..",
 "F -.-.-."};
		String message = "-. -- -.-.-. -.-.-. --- --.. ...- .-..--.";
		assertEquals("BAFF?IN?", new MorselikeCode().decrypt(library, message));
	}
}
