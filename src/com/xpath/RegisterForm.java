package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Keerthana");
		driver.findElement(By.id("lastName")).sendKeys("Sridharan");
		driver.findElement(By.id("username")).sendKeys("keerthisridhar96");
		driver.findElement(By.name("Passwd")).sendKeys("keerthi22");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("keerthi22");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.id("phoneNumberId")).sendKeys("9597520974");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();

	}

}
