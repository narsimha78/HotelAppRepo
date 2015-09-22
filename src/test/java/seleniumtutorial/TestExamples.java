package seleniumtutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestExamples {

	@BeforeSuite
	public void first(){
		
		System.out.println("I am first");
	}
	
	@AfterSuite
	public void last(){
		
		System.out.println("I am Last");
	}
	
	@BeforeClass
	public void beforeclass(){
		
		System.out.println("I am just after before suite");
	}
	
	@AfterClass
	public void afterClass(){
		
		System.out.println("I am just Before after suite");
	}
	
	@Test
	public void beforeMethod(){
		
		System.out.println("I am just just after Before class");
	}
	
	@Test
	public void afterMethod(){
		
		System.out.println("I am just before after class");
	}
	
	@Test
	public void test1(){
		
		System.out.println("I am first test");
	}
	
	@Test
	public void test2(){
		
		System.out.println("I am second test");
	}

}
