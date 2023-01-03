package testbase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {

	@BeforeMethod
	public void beforeMethodAnnotation()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethodAnnotation()
	{
		System.out.println("After MEthod");
	}
	
	@BeforeClass
	public void beforeClassAnnotation()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClassAnnotation()
	{
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void beforeTestAnnotation()
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	public void afterTestAnnotation()
	{
		System.out.println("After test");
	}
	
	@BeforeSuite
	public void beforeSuitAnnotaion()
	{
		System.out.println("BEfore suit");
	}
	
	@AfterSuite
	public void afterSuitAnnotation()
	{
		System.out.println("After suit");
	}
		
}