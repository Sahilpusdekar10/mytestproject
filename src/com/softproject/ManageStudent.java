package com.softproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageStudent extends BaseTest{
	@Test
	void test() {
		String exp_tittle = "ManageStudent";
		//String act_tittle = "hello course";
		String act_tittle = "ManageStudent";

		if (exp_tittle.equals(act_tittle)) {
			System.out.print("Test passed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}
	@Test(priority = 5)
	public void manageStudent() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[6]/a/span")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void allStudent() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[6]/ul/li[1]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"customers-table_filter\"]/label/input")).sendKeys("Shikha dev");
		
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void addStudent() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[6]/ul/li[2]/a/span")).click(); // open add student
		
		driver.findElement(By.name("first_name")).sendKeys("Sushma"); // first name
		
		driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("patil"); // last name
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[3]/div/input")).sendKeys("sushmapatil@gmail.com"); // email
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[4]/div/input")).sendKeys("1122334455"); // password

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[5]/div/select")).sendKeys("442902"); // Area code

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[6]/div/input")).sendKeys("9876543218"); // phone number

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[7]/div/input")).sendKeys("Deccan circle pune"); // Address

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[8]/div/input")).sendKeys("440011"); // postal code

		driver.findElement(By.xpath("//*[@id=\"country_id\"]")).sendKeys("INDIA"); // country

		driver.findElement(By.xpath("//*[@id=\"state_id\"]")).sendKeys("Maharastra"); // state

		driver.findElement(By.xpath("//*[@id=\"city_id\"]")).sendKeys("Nagpur"); // city

		driver.findElement(By.xpath("//*[@id=\"gender\"]")).sendKeys("feamle"); // Gender

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[13]/div/textarea")).sendKeys("hardworking"); // about student
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[3]/div/button")).submit(); // SAVE BUTTON 
		
		Thread.sleep(2000);
		driver.close();
	}
}
