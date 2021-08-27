package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mynthra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement mobileno=driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		mobileno.sendKeys("7708620142");
		WebElement cont=driver.findElement(By.className("submitBottomOption"));
		cont.click();
		

	}

}
