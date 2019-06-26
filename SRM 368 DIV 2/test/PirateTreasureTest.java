import org.junit.Test;
import static org.junit.Assert.*;

public class PirateTreasureTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] steps = new int[] {1};
		String[] directions = new String[] {"NORTH"};
		assertEquals(1.0, new PirateTreasure().getDistance(steps, directions), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] steps = new int[] {2};
		String[] directions = new String[] {"NORTHWEST"};
		assertEquals(2.0, new PirateTreasure().getDistance(steps, directions), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] steps = new int[] {3,10,7};
		String[] directions = new String[] {"EAST","WEST","EAST"};
		assertEquals(0.0, new PirateTreasure().getDistance(steps, directions), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] steps = new int[] {34,48,34};
		String[] directions = new String[] {"NORTH","SOUTHWEST","EAST"};
		assertEquals(0.08326112068522587, new PirateTreasure().getDistance(steps, directions), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] steps = new int[] {2,2,2,1};
		String[] directions = new String[] {"NORTH","NORTH","NORTH","NORTHWEST"};
		assertEquals(6.744277676240694, new PirateTreasure().getDistance(steps, directions), 1e-9);
	}
}
