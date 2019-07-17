import org.junit.Test;
import static org.junit.Assert.*;

public class ThreePhotosTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] A = new String[] {"YY","YY"};
		String[] B = new String[] {"YY","YY"};
		String[] C = new String[] {"YY","YY"};
		assertEquals(0, new ThreePhotos().removeCubes(A, B, C));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] A = new String[] {"NNN","NNN","NNN"};
		String[] B = new String[] {"NNN","NNN","NNN"};
		String[] C = new String[] {"NNN","NNN","NNN"};
		assertEquals(27, new ThreePhotos().removeCubes(A, B, C));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] A = new String[] {"NNNNN","NNNNN","NNNNN","YYNNN","NNNNN"};
		String[] B = new String[] {"NNNNN","NNNNN","NNNNN","NNYNY","NNNNN"};
		String[] C = new String[] {"NNYNN","NNNNY","NNNNN","NNNNN","NNNNN"};
		assertEquals(123, new ThreePhotos().removeCubes(A, B, C));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] A = new String[] {"YY","YY"};
		String[] B = new String[] {"YY","YY"};
		String[] C = new String[] {"YN","YN"};
		assertEquals(-1, new ThreePhotos().removeCubes(A, B, C));
	}
}
