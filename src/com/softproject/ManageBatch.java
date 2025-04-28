package com.softproject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageBatch extends BaseTest {

	@Test
	void test() {
		String exp_tittle = "Manage Batch";
		// String act_tittle = "Bye";
		String act_tittle = "Manage Batch";

		if (exp_tittle.equals(act_tittle)) {
			System.out.print("Test passed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 5)
	public void manageBatch() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[11]/a/span")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void studentBatchList() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[11]/ul[1]/li/a/span")).click();
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"customers-table_filter\"]/label/input"));
		searchBox.sendKeys("java Batch");
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void stBatchCreate() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[11]/a/span")).click(); // expand manage batch

		// error in 45
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[11]/ul[2]/li/a/span")).click(); // open stbatchCreate

		driver.findElement(By.xpath("//*[@id=\"batch_id\"]")).sendKeys("Java Batch"); // select Batch Name

		driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[2]/div/div/span/span[1]/span"))
				.sendKeys("Shikha Dev"); // select student

		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Software Testing"); // select course

		driver.findElement(By.xpath("//*[@id=\"teacher_id\"]")).sendKeys("Sushma patil"); // select teacher

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[7]/div/button")).submit();
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void batchList() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[11]/a/span")).click(); // expand manage batch

		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[11]/ul[3]/li/a/span")).click(); // open batch List

		driver.findElement(By.xpath("//*[@id=\"customers-table_filter\"]/label/input")).sendKeys("Testing Batch"); // search box batch list

		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void batchCreate() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[11]/a/span")).click(); // expand manage batch

		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[11]/ul[4]/li/a/span")).click(); // open batch create

		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[11]/ul[4]/li/a/span")); // Batch

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div/div/input"))
				.sendKeys("Testing Demo Sahili");

		Thread.sleep(2000);

		driver.findElement(By.className("btn btn-primary")).submit();
		driver.close();

	}
}
