import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import base.MyInteger;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOdd() {	
		MyInteger i3 = new MyInteger(3);
		assertEquals(true, i3.isOdd());
		
		MyInteger i4 = new MyInteger(4);
		assertEquals(false, i4.isOdd());
	}
	
	@Test
	public void testEven(){
		MyInteger i3 = new MyInteger(3);
		assertEquals(false, i3.isEven());
		
		
		MyInteger i4 = new MyInteger(4);
		assertEquals(true, i4.isEven());
	}
	
	@Test
	public void testPrime(){
		MyInteger i4 = new MyInteger(4);
		assertEquals(false, i4.isPrime());
		
		
		MyInteger i3 = new MyInteger(3);
		assertEquals(true, i3.isPrime());
	}
	
	@Test
	public void testEquals(){
		MyInteger y4 = new MyInteger(4);
		MyInteger y3 = new MyInteger(3);
		int i4 = 4;
		int i3 = 3;
		
		assertEquals(true, y4.equals(i4));
		assertEquals(false, y4.equals(i3));
		assertEquals(true, y3.equals(i3));
		assertEquals(false, y4.equals(i3));
		
		
	}


}
