package nut.fut.chill;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	
	@Parameters({"url","browser"})
	@Test
	public void test1(String url,String browser)
	{
	        if(browser.equalsIgnoreCase("FF"))
	        {
	                System.out.println("The browser value is : " +browser);
	        }
	        else if(browser.equalsIgnoreCase("Chrome"))
	        {
	                System.out.println("The browser value is : " +browser);
	        }
	        else if(browser.equalsIgnoreCase("IE"))
	        {
	                System.out.println("The browser value is : " +browser);
	        }
	        else
	        {
	               System.out.println("Incorrect browser value passed.");
	        }
	}
	
	@Test
	public void fridge()
	{
		System.out.println("Fridge");
	}
	@Test
	public void divisionByZero()
	{
		System.out.println(9/1);
	}
	
	@Test
	public void boy()
	{
		System.out.println("Hello world");
		int a= 30 + 45;
		float b = 56* 34;
		char ch = 'g';
		System.out.println(a);
		System.out.println(b);
		System.out.println(ch);
	}
}
