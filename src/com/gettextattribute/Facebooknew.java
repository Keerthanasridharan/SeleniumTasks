package com.gettextattribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooknew {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("keerthanasridharan22@gmail.com");
		String un=username.getAttribute("value");
		System.out.println(un);
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Hellaway@2021");
		System.out.println(password.getAttribute("value"));

	}

}
