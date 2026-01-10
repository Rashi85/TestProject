package d_testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;



public class one {

	@Before
	public void setUp() throws Exception {
		
		System.out.println("before test case");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after test case");
	}


	@Test
	public void first_testcase() {
		//fail("Not yet implemented");
		System.out.println("test1");
	}
	
	
}
