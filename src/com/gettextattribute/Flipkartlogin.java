package com.gettextattribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkartlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/ ");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",login);
		
		new WebDriverWait(driver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='_2IX_2- VJZDxU']")));
		WebElement username=driver.findElement((By.xpath("//input[@class='_2IX_2- VJZDxU']")));
		username.sendKeys("keerthi");
		System.out.println(username.getAttribute("value"));
		WebElement pw=driver.findElement(By.xpath("//input[@type='password']"));
		pw.sendKeys("Hell@2020");
		System.out.println(pw.getAttribute("value"));

	}

}
