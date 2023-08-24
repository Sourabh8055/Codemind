package testcasesreservation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void t1()  
		{
			System.out.println("BeforeSuite");
		}
	
	@BeforeTest
	public void t2()  
		{
			System.out.println("BeforeTest");
		}
	
	@BeforeClass
	public void t3()  
		{
			System.out.println("BeforeClass");
		}

	@BeforeMethod
	public void t4()  
		{
			System.out.println("BeforeMethod");
		}
	
	@Test
	public void test_1()  
		{
			System.out.println("TestCase");
		}
   
	
	@AfterMethod
	public void t5()  
		{
			System.out.println("AfterMethod");
		}
	
	@AfterClass
	public void t6()  
		{
			System.out.println("AfterClass");
		}
	
	@AfterTest
	public void t7()  
		{
			System.out.println("AfterTest");
		}

	@AfterSuite
	public void t8()  
		{
			System.out.println("AfterSuite");
		}
	}


