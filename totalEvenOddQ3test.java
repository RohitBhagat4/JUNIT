package JunitSample.JunitProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class totalEvenOddQ3test {
	
	totalEvenOddQ3 a = new totalEvenOddQ3();
	
	@Test
	public void testSeries1()
	{
		assertEquals("1 1", a.countEvenOdd(23));
	}
	
	@Test
	public void testSeries2()
	{
		assertEquals("2 0", a.countEvenOdd(22));
	}
	
	@Test
	public void testSeries3()
	{
		assertEquals("0 0", a.countEvenOdd(22));
	}
	

}
