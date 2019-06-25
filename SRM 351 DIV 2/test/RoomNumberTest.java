import org.junit.Test;
import static org.junit.Assert.*;

public class RoomNumberTest {
	
	@Test(timeout=2000)
	public void test0() {
		int roomNumber = 122;
		assertEquals(2, new RoomNumber().numberOfSets(roomNumber));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int roomNumber = 9999;
		assertEquals(2, new RoomNumber().numberOfSets(roomNumber));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int roomNumber = 12635;
		assertEquals(1, new RoomNumber().numberOfSets(roomNumber));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int roomNumber = 888888;
		assertEquals(6, new RoomNumber().numberOfSets(roomNumber));
	}
}
