package com.softproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftronixProject extends BaseTest {

	@Test
	void test() {
		String exp_tittle = "manageCourse";
		//String act_tittle = "Bye";
		String act_tittle = "manageCourse";

		if (exp_tittle.equals(act_tittle)) {
			System.out.print("Test passed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 5)
	public void manageCourse() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[2]/a/span")).click();
		Thread.sleep(2000);
	}

@Test(priority = 6)
public void reviwePending() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[2]/ul/li[1]/a/span")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void hold() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[2]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void approved() throws InterruptedException {
		driver.findElement(By.xpath("//*//*[@id=\"sidebar-menu\"]/li[2]/ul/li[3]/a/span")).click();
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"customers-table_filter\"]/label/input"));
		searchBox.sendKeys("learn java");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void allCourse() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[2]/ul/li[4]/a/span")).click();
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"customers-table_filter\"]/label/input"));
		searchBox.sendKeys("java");
	searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	/*@Test(priority = 10)
	public void enrollInCourse() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[2]/ul/li[5]/a/span")).click();

		WebElement searchMatch = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[1]/div/div[1]"));
		searchMatch.sendKeys("Shikha Dev");
		searchMatch.submit();

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[2]/div/div[1]"))
				.sendKeys("Testing");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[3]/input")).sendKeys("45");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/form/div[4]/div/button")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 11)
	public void enrollInCourse1() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Click on the desired menu item
		WebElement menuItem = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sidebar-menu\"]/li[2]/ul/li[5]/a/span")));
		menuItem.click();
		
		// Wait for the dropdown input to be visible and click it to open the dropdown
		WebElement studentDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_id-selectized")));
		studentDropdown.click();

		// Now wait for the dropdown options to be visible
		WebElement dropdownOptionsContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.className("selectize-dropdown-content")
		));

		// Select the specific option you want by visible text ("Shikha Dev")
		List<WebElement> options = dropdownOptionsContainer.findElements(By.className("option"));

		for (WebElement option : options) {
		    if (option.getText().contains("Shikha Dev")) {
		        option.click();
		        break;
		    }
		}
		
		Thread.sleep(500);
		
		WebElement courseDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("course_id-selectized")));
		courseDropdown.click();

		WebElement courseDropdownContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.className("selectize-dropdown-content")
		));

		List<WebElement> courseContentOptions = courseDropdownContainer.findElements(By.className("option"));

		for (WebElement option : courseContentOptions) {
			System.out.println(option.getText());
		    if (option.getText().contains("testing")) {
		        option.click();
		        break;
		    }
		}

		WebElement durationField = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.name("expired_after_days")));
		durationField.sendKeys("45");

		WebElement submitButton = wait.until(ExpectedConditions
				.elementToBeClickable(By.className("btn btn-primary")));
		submitButton.click();
		Thread.sleep(2000);
	}*/
}
