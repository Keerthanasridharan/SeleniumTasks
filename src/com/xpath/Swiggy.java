package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		WebElement signup=driver.findElement(By.linkText("Sign up"));
		signup.click();
		WebElement mobile=driver.findElement(By.id("mobile"));
		mobile.sendKeys("7708620142");
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Prabu");
		driver.findElement(By.id("email")).sendKeys("keerthanasridharan22@gmail.com");
		driver.findElement(By.id("password")).sendKeys("keerthi@22");
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
	}

}
