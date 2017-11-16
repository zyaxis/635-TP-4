import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EventTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void log_clear() 
	{
		Event e = new Event();
		e.newLog();
		assertTrue("succesfully got copy", e.getLogSize() == 0);
	}

	@Test
	public void log_add() 
	{
		Event e = new Event();
		e.logEvent("test");
		assertTrue("succesfully got copy", e.getLogSize() == 1);
	}
}
