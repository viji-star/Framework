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
	public void divisionByZero()
	{
		System.out.println(9/1);
	}
	
	@Test
	public void boy()
	{
		System.out.println("Hello world");
	}
}
