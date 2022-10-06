package JunitSample.JunitProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q5sumtest {
	
	Q5sum a = new Q5sum();
	
	@Test
	public void testSeries1()
	{
		assertEquals(16, a.sum1("2+3-4/2*5"));
	}
	
	@Test
	public void testSeries2()
	{
		assertEquals(7, a.sum1("2+3-4/2*5"));
	}

	@Test
	public void testSeries3()
	{
		assertEquals(10, a.sum1("1234"));
	}
	
	@Test
	public void testSeries4()
	{
		assertEquals(1, a.sum1("1234"));
	}
}

