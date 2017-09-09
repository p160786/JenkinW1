package com.org.test.MavenFirstProject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.internal.ParameterHolder;

public class Parameter {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest

	public void beforeTest(String bro)
	{

		if(bro.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			  
		}
		else if(bro.equals("firefox"))	 
		{ 
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
		 driver = new FirefoxDriver();
	
		}
		
		else if(bro.equals("internet explorer"))
		{
			
			
			System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 driver.manage().window().maximize();
			 
		}
		else
		{
			System.out.println("before Test" +bro);
		}
		
		driver.get("https://dev.tracko.co.in");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Before Test");
		
	}
	
	@Test(priority=1)
	public void f1() throws InterruptedException 
	{
		System.out.println("Test");
	SignUpClass ref = new SignUpClass(driver);
	   ref.SignUp();

		SignInClass ref1 = new SignInClass(driver);
		ref1.test();
		
		System.out.println("Test test");
	}
	
	
	
	@AfterTest
	public void afterTest() 
	{
		driver.quit();
		System.out.println("After test");
	}
}

	
