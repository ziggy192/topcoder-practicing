import org.junit.Test;
import static org.junit.Assert.*;

public class MirroredClockTest {
	
	@Test(timeout=2000)
	public void test0() {
		String time = "10:00";
		assertEquals("02:00", new MirroredClock().whatTimeIsIt(time));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String time = "01:15";
		assertEquals("10:45", new MirroredClock().whatTimeIsIt(time));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String time = "03:40";
		assertEquals("08:20", new MirroredClock().whatTimeIsIt(time));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String time = "00:00";
		assertEquals("00:00", new MirroredClock().whatTimeIsIt(time));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String time = "11:53";
		assertEquals("00:07", new MirroredClock().whatTimeIsIt(time));
	}
}
