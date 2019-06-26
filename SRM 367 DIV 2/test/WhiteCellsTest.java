import org.junit.Test;
import static org.junit.Assert.*;

public class WhiteCellsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] board = new String[] {"........",
 "........",
 "........",
 "........",
 "........",
 "........",
 "........",
 "........"};
		assertEquals(0, new WhiteCells().countOccupied(board));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] board = new String[] {"FFFFFFFF",
 "FFFFFFFF",
 "FFFFFFFF",
 "FFFFFFFF",
 "FFFFFFFF",
 "FFFFFFFF",
 "FFFFFFFF",
 "FFFFFFFF"};
		assertEquals(32, new WhiteCells().countOccupied(board));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] board = new String[] {".F.F...F",
 "F...F.F.",
 "...F.F.F",
 "F.F...F.",
 ".F...F..",
 "F...F.F.",
 ".F.F.F.F",
 "..FF..F."};
		assertEquals(1, new WhiteCells().countOccupied(board));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] board = new String[] {"........",
 "..F.....",
 ".....F..",
 ".....F..",
 "........",
 "........",
 ".......F",
 ".F......"};
		assertEquals(2, new WhiteCells().countOccupied(board));
	}
}
