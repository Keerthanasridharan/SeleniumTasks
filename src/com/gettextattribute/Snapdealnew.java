package com.gettextattribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdealnew {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
driver.findElement(By.id("inputValEnter")).sendKeys("Handbags");
driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
driver.findElement(By.xpath("//p[text()='Raspberry Black P.U. Combo']")).click();
	}

}
