package com.gettextattribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleNew {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("greens velmurugan ");
		WebElement serach=driver.findElement(By.xpath("//input[@value='Google Search']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", serach);
		driver.findElement(By.xpath("//h3[contains(text(),'Velmurugan K - Technical')]")).click();
		

	}

}
