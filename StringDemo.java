package JunitSample.AssignmentJUNIT;

public class StringDemo {
	
	public char charatt(String myStr, int index)
	{
		    char result = myStr.charAt(index);
		    
		return result;
		
	}
	
	public String concatString(String str1 , String str2)
	{
		return str1+str2;
		
	}
	
	public boolean containsString(String str1, String str2)
	{
		return str1.contains(str2);
		
	}
	
	public boolean endsWithfunction(String str1, String str2)
	{
		return str1.endsWith(str2);
	}
	
	public boolean equalsFunction(String str1, String str2)
	{
		return str1.equals(str2);
	}
	
	public boolean equalsIgnoreCaseFunction(String str1, String str2)
	{
		return str1.equalsIgnoreCase(str2);
	}
	
	public int indexOfFunction(String str1, String str2) {
		return str1.indexOf(str2);
	}
	
	public boolean internFunction(String str1 , String str2)
	{
		String str3 = str1.intern();
		return str2==str3;
	}
	
	public int lastIndexofFunction(String str, char c)
	{
		return str.lastIndexOf(c);
	}
	
	public int lengthofString(String str)
	{
		return str.length();
	}
	
	public String replaceFunction(String str, char toreplace, char withreplace)
	{
		return str.replace(toreplace, withreplace);
	}
	
	public String[] splitFunction(String str,String s)
	{
	
		return str.split(s);
	}
	
	public String subStringFunction(String str,int start, int end)
	{
		return str.substring(start, end);
	}
	
	public String toLowerCaseFunction(String str)
	{
		return str.toLowerCase();
	}
	
	public String toUpperCaseFunction(String str)
	{
		return str.toUpperCase();
	}

	public String trimFunction(String str)
	{
		return str.trim();
	}

	
	public String valueOfFunction(int a, int b)
	{
		return String.valueOf(a) + String.valueOf(b);
	}
}
