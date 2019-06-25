import org.junit.Test;
import static org.junit.Assert.*;

public class AzimuthMonitoringTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] instructions = new String[] {"RIGHT"};
		assertEquals(90, new AzimuthMonitoring().getAzimuth(instructions));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] instructions = new String[] {"LEFT", "LEFT", "TURN AROUND"};
		assertEquals(0, new AzimuthMonitoring().getAzimuth(instructions));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] instructions = new String[] {"LEFT 5", "RIGHT 10", "LEFT 15", "RIGHT 20", "LEFT 25", "RIGHT 30", "LEFT 35", "RIGHT 40"};
		assertEquals(20, new AzimuthMonitoring().getAzimuth(instructions));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] instructions = new String[] {"RIGHT 59", "RIGHT", "RIGHT", "HALT", "LEFT", "LEFT", "LEFT"};
		assertEquals(239, new AzimuthMonitoring().getAzimuth(instructions));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] instructions = new String[] {"TURN AROUND", "HALT", "LEFT 5", "HALT", "LEFT 5", "HALT"};
		assertEquals(180, new AzimuthMonitoring().getAzimuth(instructions));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] instructions = new String[] {"LEFT", "LEFT", "LEFT", "LEFT", "LEFT", "HALT"};
		assertEquals(270, new AzimuthMonitoring().getAzimuth(instructions));
	}
}
