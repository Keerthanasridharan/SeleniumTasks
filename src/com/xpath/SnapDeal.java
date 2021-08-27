package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement targetElement=driver.findElement(By.xpath("//div[@class='accountInner']"));
Actions action=new Actions(driver);
action.moveToElement(targetElement).perform();
driver.findElement(By.xpath("//span[text()='Register']")).click();
driver.switchTo().frame("iframeLogin");
driver.findElement(By.id("userName")).sendKeys("7708620142");
driver.findElement(By.xpath("//button[text()='continue']")).click();
driver.findElement(By.id("j_username_new")).sendKeys("keerthi22@gmail.com");
driver.findElement(By.id("j_name")).sendKeys("Keerthi");
driver.findElement(By.id("j_password")).sendKeys("keethi123");
driver.findElement(By.xpath("//button[@id='userSignup']")).click();
	}

}
