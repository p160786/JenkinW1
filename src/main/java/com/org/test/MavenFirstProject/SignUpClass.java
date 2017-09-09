package com.org.test.MavenFirstProject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUpClass {
	

	WebDriver driver;
	
	public SignUpClass(WebDriver driver2){
		driver=driver2;
	}
	
	public void SignUp() throws InterruptedException
	{
		
		 driver.findElement(By.xpath("//a[text()='Sign Up Free']")).click();
		 // driver.findElement(By.xpath("/html/body/header/div/nav/div[2]/ul/li[6]/a")).click();//by using absolute path
		   driver.findElement(By.id("name")).sendKeys("Poonam");
		   driver.findElement(By.id("email")).sendKeys("gghh1@gmail.com");
		   driver.findElement(By.id("mobile")).sendKeys("1564505674");
		   driver.findElement(By.xpath("//*[@id='sub_btn_signup']")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id='otp']")).sendKeys("123456");
		   driver.findElement(By.xpath("//*[@id='sub_btn_verify']")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//button[@class='confirm'][text()='OK']")).click();
		    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("qwe@455");
		    driver.findElement(By.xpath("//*[@id='repassword']")).sendKeys("qwe@455");
		    driver.findElement(By.xpath("//*[@id='sub_btn_setpass']")).click();
}
}