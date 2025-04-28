package com.softproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CourseReference extends BaseTest{
	@Test
	void test() {
		String exp_tittle = "courseReference";
		//String act_tittle = "hello course";
		String act_tittle = "courseReference";

		if (exp_tittle.equals(act_tittle)) {
			System.out.print("Test passed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 5)
	public  void courseReference() throws InterruptedException   {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[3]/a/span")).click();//coursereference
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public  void categories() throws InterruptedException   {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[3]/ul/li[1]/a/span")).click();//categories
		Thread.sleep(2000);
	}
	@Test(priority=7)
	public void addCategories() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/a")).click();//add categories
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[4]/div/input[1]")).submit();//save and another
		Thread.sleep(2000);
	}
	@Test(priority=8)
	public void name() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Testing Demo sahili");//NAME in add categories
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[2]/label")).click();//feature
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[4]/div/input[1]")).submit();//save and another
		Thread.sleep(2000);
	}
}
	



