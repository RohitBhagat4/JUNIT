package JunitSample.AssignmentJUNIT;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringDemoTest {
	
	StringDemo st = new StringDemo();
	
	@Test
	public void charattTest1()
	{
		assertEquals(st.charatt("Rohit",0),'R');
	}
	
	@Test
	public void charattTest2()
	{
		assertEquals(st.charatt("Rohit",0),'t');
	}
	
	
	
	@Test
	public void concatStringTest1()
	{
		assertEquals(st.concatString("Rohit","Bhagat"),"RohitBhagat");
	}
	
	@Test
	public void concatStringTest2()
	{
		assertEquals(st.concatString("Rohit","Bhagat"),"");
	}
	
	
	
	@Test
	public void containsStringTest1()
	{
		assertEquals(st.containsString("Rohit Bhagat", "Rohit"),true);
	}
	
	@Test
	public void containsStringTest2()
	{
		assertEquals(st.containsString("Rohit",""),true);
	}
	
	
	
	@Test
	public void endsWithfunctionTest1()
	{
		assertEquals(st.endsWithfunction("Rohit Bhagat", "t"),true);
	}
	
	@Test
	public void endsWithfunctionTest2()
	{
		assertEquals(st.endsWithfunction("Rohit","a"),true);
	}
	
	@Test
	public void equalsFunctionTest1()
	{
		assertEquals(st.equalsFunction("Rohit", "Rohit"),true);
	}
	
	@Test
	public void equalsFunctionTest2()
	{
		assertEquals(st.equalsFunction("Rohit","ROHIT"),true);
	}
	
	@Test
	public void equalsIgnoreCaseFunctionTest1()
	{
		assertEquals(st.equalsIgnoreCaseFunction("Rohit", "Rohit"),true);
	}
	
	@Test
	public void equalsIgnoreCaseFunctionTest2()
	{
		assertEquals(st.equalsIgnoreCaseFunction("Rohit","ROHIT"),false);
	}
	
	
	
	@Test
	public void indexOfFunctionTest1()
	{
		assertEquals(st.indexOfFunction("Rohit Bhagat","B"),6);
	}
	
	@Test
	public void indexOfFunctionTest2()
	{
		assertEquals(st.indexOfFunction("Rohit Bhagat","z"),-1);
	}
	
	@Test
	public void indexOfFunctionTest3()
	{
		assertEquals(st.indexOfFunction("Rohit Bhagat",""),-1);
	}
	
	
	
	@Test
	public void internFunctionTest1()
	{
		assertEquals(st.internFunction(new String("Rohit"),"Rohit"),true);
	}
	
	@Test
	public void internFunctionTest2()
	{
		assertEquals(st.internFunction(new String("Rohit"),"ROHIT"),true);
	}
	
	
	
	@Test
	public void lastIndexofFunctionTest1()
	{
		assertEquals(st.lastIndexofFunction("Rohit",'t'),4);
	}
	
	@Test
	public void lastIndexofFunctionTest2()
	{
		assertEquals(st.lastIndexofFunction("Rohit",'z'),-1);
	}
	
	

	@Test
	public void lengthofStringTest1()
	{
		assertEquals(st.lengthofString("Rohit"),5);
	}
	
	@Test
	public void lengthofStringTest2()
	{
		assertEquals(st.lengthofString("Rohit"),1);
	}
	
	
	
	@Test
	public void replaceFunctionTest1()
	{
		assertEquals(st.replaceFunction("Rohit",'R','M'),"Mohit");
	}
	
	@Test
	public void replaceFunctionTest2()
	{
		assertEquals(st.replaceFunction("Rohit",'p','M'),"Rohit");
	}
	

	
	@Test
	public void splitFunctionTest1()
	{
		assertEquals(st.splitFunction("Rohit Bhagat","\\s"),new String[] {"Rohit","Bhagat"});
	}
	
	@Test
	public void splitFunctionTest2()
	{
		assertEquals(st.splitFunction("Rohit Bhagat Patil","\\s"),new String[] {"Rohit","Bhagat","RB"});
	}
	
	
	
	@Test
	public void subStringFunctionTest1()
	{
		assertEquals(st.subStringFunction("Rohit Bhagat Patil",0,5),"Rohit");
	}
	
	@Test
	public void subStringFunctionTest2()
	{
		assertEquals(st.subStringFunction("Rohit Bhagat Patil",0,5),"Rohit ");
	}
	
	@Test
	public void toLowerCaseFunctionTest1()
	{
		assertEquals(st.toLowerCaseFunction("Rohit Bhagat"),"rohit bhagat");
	}
	
	@Test
	public void toLowerCaseFunctionTest2()
	{
		assertEquals(st.toLowerCaseFunction("ROHIT BHAGAT"),"");
	}
	
	
	
	@Test
	public void toUpperCaseFunctionTest1()
	{
		assertEquals(st.toUpperCaseFunction("Rohit Bhagat"),"ROHIT BHAGAT");
	}
	
	@Test
	public void toUpperCaseFunctionTest2()
	{
		assertEquals(st.toUpperCaseFunction("Rohit Bhagat"),"");
	}
	
	
	
	@Test
	public void trimFunctionTest1()
	{
		assertEquals(st.trimFunction("Rohit      ")+"Bhagat","RohitBhagat");
	}
	
	@Test
	public void trimFunctionTest2()
	{
		assertEquals(st.trimFunction("Rohit      ")+"Bhagat","Rohit   Bhagat");
	}
	
	
	
	@Test
	public void valueOfFunctionTest1()
	{
		assertEquals(st.valueOfFunction(12,13),"1213");
	}
	
	@Test
	public void valueOfFunctionTest2()
	{
		assertEquals(st.valueOfFunction(12,13),25);
	}
	
	
	
}
