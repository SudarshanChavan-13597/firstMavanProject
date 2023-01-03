package annotations1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBAse {
	
		@BeforeSuite
		public void beforeSuiteAnnotation()
		{
			System.out.println("before suite annotation");
		}
		
		@BeforeClass
		public void beforeClassAnnotation()
		{
			System.out.println("before class annotation");
		}

		@BeforeMethod
		public void beforMethodAnnottion()
		{
			System.out.println("before method annotation");
		}

		@BeforeTest
		public void beforeTEstAnnotation()
		{
			System.out.println("before Test annotation");
		}
		
		@AfterTest
		public void afterTestAnnotation()
		{
			System.out.println("after test annotation");
		}
		
		@AfterMethod
		public void afterMethodAnnottion()
		{
			System.out.println("after method annotation");
		}
		
		@AfterClass
		public void afterClassAnnotation()
		{
			System.out.println("after class annotation");
		}
		
		@AfterSuite
		public void afterSuiteAnnotation()
		{
			System.out.println("after suite annotation");
		}
		
}
