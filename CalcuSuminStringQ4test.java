package JunitSample.JunitProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcuSuminStringQ4test {
	
	CalcuSuminStringQ4 a = new CalcuSuminStringQ4();
	
	@Test
	public void testSeries1()
	{
		assertEquals(6, a.sum1("1+2+3"));
	}
	
	@Test
	public void testSeries2()
	{
		assertEquals(7, a.sum1("1+2+3"));
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
