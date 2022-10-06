package JunitSample.JunitProject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Addition10Q1test {

	Addition10Q1 a = new Addition10Q1();
	
	@Test
	public void testSeries1()
	{
		assertEquals(55, a.add());
	}
	
	@Test
	public void testSeries2()
	{
		assertEquals(6, a.add());
	}
	
    @Test
    public void myTestMethod(){
        /**
         * we are demonstrating the usage of assertArrayEquals()
         * method here, so we are preparing input data here itself.
         * In real scenario, we will consider the methods returned 
         * value which suppose to be test, as a input. 
         */
        //assume that the below array represents expected result
        String[] expectedOutput = {"apple", "mango", "Grape"};
        //assuem that the below array is returned from the method 
        //to be tested.
        String[] methodOutput = {"apple", "mango", "grape"};
        assertArrayEquals(expectedOutput, methodOutput);
    }

	
}
