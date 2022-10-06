package JunitSample.JunitProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q6sum100to200by7test {
	
	Q6sum100to200by7 a = new Q6sum100to200by7();
	
	@Test
	public void testSeries1()
	{
		assertEquals(2107, a.sum());
	}
	
	@Test
	public void testSeries2()
	{
		assertEquals(7, a.sum());
	}

}
