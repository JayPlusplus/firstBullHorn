import static org.junit.Assert.*;

import org.junit.Test;

public class BullhornTest {

	@Test
	public void userTest() {
		User u = new User("jay","wu");
		
		assertTrue(u.getLastName().equals("wu"));
	}
	
	@Test
	public void userTest2() {
		User u = new User("","");
		
		assertTrue(u.getFirstName().length() == 0);
	}

}
