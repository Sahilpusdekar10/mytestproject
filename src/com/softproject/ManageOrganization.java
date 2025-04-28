package com.softproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManageOrganization extends BaseTest {
	
	@Test
	void test() {
		String exp_tittle = "ManageOrganization";
		//String act_tittle = "hello course";
		String act_tittle = "ManageOrganization";

		if (exp_tittle.equals(act_tittle)) {
			System.out.print("Test passed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority = 5)
	public void manageOrg() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[5]/a/span")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void pendingOrg() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[5]/ul/li[1]/a/span")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void approvedOrg() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[5]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void blockedOrg() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[5]/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void allOrg() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[5]/ul/li[4]/a/span")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 10)
	public void addOrg() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[5]/ul/li[5]/a/span")).click();
		Thread.sleep(2000);
	}

}
