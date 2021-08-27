package com.gettextattribute;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopclue {

	public static void main(String[] args) {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.shopclues.com/wholesale.html ");
		driver.findElement(By.id("autocomplete")).sendKeys("Umbrellas");

		WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", search);
		driver.findElement(By.xpath("//div[@class='row']/div[1]")).click();
		

	}

}
