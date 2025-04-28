package com.softproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	public WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softronix.in/");
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[8]/a")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void email() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("admin@email.com");
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void password() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void singin() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div[4]/div/button")).click();
		Thread.sleep(2000);
	}

//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}

}
