package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsSqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Keerthana");
		driver.findElement(By.id("lastName")).sendKeys("sridharan");
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("956236547");

		WebElement ele = driver.findElement(By.id("hobbies-checkbox-1"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele);

		WebElement ele1 = driver.findElement(By.id("hobbies-checkbox-2"));
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele1);

		driver.findElement(By.id("currentAddress")).sendKeys("56/7,KP Nagar");
		((JavascriptExecutor) driver).executeScript("return arguments[0].scrollIntoView(true);",
				new WebDriverWait(driver, 20)
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Select State']"))));
		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Select State']"))).click();

		driver.findElement(By.xpath("//div[text()='Uttar Pradesh']")).click();
		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Select City']")));
		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Select City']"))).click();
		driver.findElement(By.xpath("//div[text()='Agra']")).click();
		driver.findElement(By.id("submit")).click();

	}

}
