package com.gettextattribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartnew {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/ ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("smart watches");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[text()='TXOR Storm M5 Smartwatch']")).click();
		

	}

}
