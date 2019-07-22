import org.junit.Test;
import static org.junit.Assert.*;

public class TwoLotteryGamesTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 3;
		int m = 2;
		int k = 1;
		assertEquals(1.0, new TwoLotteryGames().getHigherChanceGame(n, m, k), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 3;
		int m = 1;
		int k = 1;
		assertEquals(0.3333333333333333, new TwoLotteryGames().getHigherChanceGame(n, m, k), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 8;
		int m = 2;
		int k = 1;
		assertEquals(0.4642857142857143, new TwoLotteryGames().getHigherChanceGame(n, m, k), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 8;
		int m = 4;
		int k = 2;
		assertEquals(0.7571428571428571, new TwoLotteryGames().getHigherChanceGame(n, m, k), 1e-9);
	}
	@Test(timeout=2000)
	public void test4() {
		int n = 4;
		int m = 3;
		int k = 1;
		assertEquals(1, new TwoLotteryGames().getHigherChanceGame(n, m, k), 1e-9);
	}
}
