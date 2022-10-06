package JunitSample.JunitProject;

public class Q5sum {
	public int sum1(String number)
	{
        
		 int sum = 0;

	     // variable to hold character
	     char ch ;

	     // variable to hold numeric value of ch
	     int n;

	     // loop to iterate the String
	     for(int i=0; i<number.length(); i++) {

	         // find character
	         ch = number.charAt(i);

	         // check character is digit?
	         if(Character.isDigit(ch)) {

	             // find numeric value of character
	             n = Character. getNumericValue(ch);

	             // then add it to sum variable
	             sum += n;
	          }
	      }

	      // return sum value
	      return sum;
	}


}
