package com.softproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageInstructor extends BaseTest {
	@Test
	void test() {
		String exp_tittle = "ManageInstructor";
		//String act_tittle = "hello course";
		String act_tittle = "ManageInstructor";

		if (exp_tittle.equals(act_tittle)) {
			System.out.print("Test passed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}
	@Test(priority = 5)
	public void manageInstructor() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[4]/a/span")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void pendingInstructor() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[4]/ul/li[1]/a/span")).click();
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"customers-table_filter\"]/label/input"));
		searchBox.sendKeys("Sushma Patil");
		//searchBox.submit();
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void approvedInstructor() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[4]/ul/li[2]/a/span")).click();
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"customers-table_filter\"]/label/input"));
		searchBox.sendKeys("Shital jain");
		//searchBox.submit();
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void blockInstructor() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[4]/ul/li[3]/a/span")).click();
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"customers-table_filter\"]/label/input"));
		searchBox.sendKeys("Aanchal Shan");
		//searchBox.submit();
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void allInstructor() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[4]/ul/li[4]/a/span")).click();
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"customers-table_filter\"]/label/input"));
		searchBox.sendKeys("Sushma Patil");
		//searchBox.submit();
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void addInstructor() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[4]/ul/li[5]/a/span")).click();// add instructor
		driver.findElement(By.xpath("//*[@id=\"input_Name\"]")).sendKeys("Shital");// first name
		driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("jain");// Last name
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[3]/div/input"))
				.sendKeys("shital@gmail.com");// email
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[4]/div/input"))
				.sendKeys("1122334455");// Password
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[5]/div/input"))
				.sendKeys("Tester");// Professional Title
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[6]/div/select"))
				.sendKeys("442902");// Area code
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[7]/div/input"))
				.sendKeys("2345678910");// Phone Number
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[8]/div/input"))
				.sendKeys("Manish Ngar");// Address
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div[9]/div/input"))
				.sendKeys("12345");// Postal code
		driver.findElement(By.xpath("//*[@id=\"country_id\"]")).sendKeys("India");// Country
		driver.findElement(By.xpath("//*[@id=\"state_id\"]")).sendKeys("Maharashtra");// state
		driver.findElement(By.xpath("//*[@id=\"city_id\"]")).sendKeys("Nashik");// City
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).sendKeys("Female");// Gender

		/*
		 * driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("jain");//
		 * facebook
		 * driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("jain");//
		 * Twitter
		 * driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("jain");//
		 * Linkedin
		 * driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("jain");//
		 * pinterest
		 * driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("jain");//
		 * About Instructor
		 */
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[3]/div/button")).submit();// save
		Thread.sleep(2000);
	}
}
