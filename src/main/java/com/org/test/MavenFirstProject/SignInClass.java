package com.org.test.MavenFirstProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInClass{

    WebDriver driver;

public SignInClass(WebDriver driver2)
{
driver = driver2;

}
	
public void test()
{
	//driver.findElement(By.xpath("//button[@class='confirm'][text()='OK']")).click();
   // driver.findElement(By.xpath("//*[@id='password']")).sendKeys("qwe@455");
   // driver.findElement(By.xpath("//*[@id='repassword']")).sendKeys("qwe@455");
    //driver.findElement(By.xpath("//*[@id='sub_btn_setpass']")).click();
    driver.findElement(By.xpath("//*[@id='login-mobile']")).sendKeys("156450567");
    driver.findElement(By.id("login-password")).sendKeys("qwe@455");
    driver.findElement(By.id("sub_btn")).click();
}

}
