package JunitSample.JunitProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialtestQ2 {
	
	FactorialQ2 fc = new FactorialQ2();
	
	@Test
	public void testSeries1()
	{
		assertEquals(6, fc.factorial(3));
	}
	
	@Test
	public void testSeries2()
	{
		assertEquals(5, fc.factorial(3));
	}
	

}
