import org.junit.Test;
import static org.junit.Assert.*;

public class UndoTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] commands = new String[] {"type a", "type b", "type c", "undo 3"};
		int[] time = new int[] {1, 2, 3, 5};
		assertEquals("a", new Undo().getText(commands, time));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] commands = new String[] {"type a", "type b", "undo 2", "undo 2"};
		int[] time = new int[] {1,2,3,4};
		assertEquals("a", new Undo().getText(commands, time));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] commands = new String[] {"type a", "undo 1", "undo 1"};
		int[] time = new int[] {1,2,3};
		assertEquals("a", new Undo().getText(commands, time));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] commands = new String[] {"type a", "type b", "type c", "undo 10"};
		int[] time = new int[] {1, 2, 3, 1000};
		assertEquals("abc", new Undo().getText(commands, time));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] commands = new String[] {"undo 1"};
		int[] time = new int[] {1};
		assertEquals("", new Undo().getText(commands, time));
	}
	@Test(timeout=2000)
	public void test5() {
		String[] commands = new String[] {"type a", "type b", "type c", "undo 1","undo 3","undo 5",};
		int[] time = new int[] {1,2,3,4,5,6};
		assertEquals("", new Undo().getText(commands, time));
	}
}
