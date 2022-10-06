package JunitSample.JunitProject;

public class totalEvenOddQ3 {
	
	public String countEvenOdd(int n)
	{
	    int even_count = 0;
	    int odd_count = 0;
	    while (n > 0)
	    {
	        int rem = n % 10;
	        if (rem % 2 == 0)
	            even_count++;
	        else
	            odd_count++;
	        n = n / 10;
	    }
	    return even_count+" "+odd_count;
	    
	}

}
