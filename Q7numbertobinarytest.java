package JunitSample.JunitProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q7numbertobinarytest {
	
	Q7numbertobinary a = new Q7numbertobinary();
	
	@Test
	public void testSeries1()
	{
		assertEquals("1001", a.decimalToBinary(9));
	}
	
	@Test
	public void testSeries2()
	{
		assertEquals("11", a.decimalToBinary(9));
	}


}
