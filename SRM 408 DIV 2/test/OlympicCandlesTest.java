import org.junit.Test;
import static org.junit.Assert.*;

public class OlympicCandlesTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] candles = new int[] {2, 2, 2};
		assertEquals(3, new OlympicCandles().numberOfNights(candles));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] candles = new int[] {2, 2, 2, 4};
		assertEquals(4, new OlympicCandles().numberOfNights(candles));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] candles = new int[] {5, 2, 2, 1};
		assertEquals(3, new OlympicCandles().numberOfNights(candles));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] candles = new int[] {1, 2, 3, 4, 5, 6};
		assertEquals(6, new OlympicCandles().numberOfNights(candles));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] candles = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		assertEquals(4, new OlympicCandles().numberOfNights(candles));
	}
}
