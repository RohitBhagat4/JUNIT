package JunitSample.JunitProject;

public class Q6sum100to200by7 {
	
	public int sum() {
		
		 int sum = 0;
		 for (int i = 101; i < 200; i++)
		 {
		     if (i % 7 == 0)
		     {
		         sum = sum + i;
		         
		     }
		 }
		return sum;
	}

}
