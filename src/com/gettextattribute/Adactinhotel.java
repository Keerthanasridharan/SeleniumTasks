package com.gettextattribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinhotel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("keerthi");
		System.out.println(username.getAttribute("value"));
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Hell@2021");
		System.out.println(pass.getAttribute("value"));
		

	}

}
