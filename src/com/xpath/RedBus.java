package com.xpath;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement icon = driver.findElement(By.id("sign-in-icon-down"));
		icon.click();
		WebElement signin = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		signin.click();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(iframe);
		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mobileNoInp']")))
				.sendKeys("7708620142");

	}

}
