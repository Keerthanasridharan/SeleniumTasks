package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		driver.findElement(By.id("from_station")).sendKeys("Hosur");
		driver.findElement(By.id("to_station")).sendKeys("Madurai");
		driver.findElement(By.xpath("//button[text()='Search trains']")).click();
//		driver.switchTo().frame("modal_window");
//		driver.findElement(By.id("email")).sendKeys("keerthanasridharan22@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("keerthi");

	}

}
