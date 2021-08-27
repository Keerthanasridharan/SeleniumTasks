package com.xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathPractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Keerthana");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Sridharan");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("No.213, NG Nagar,Hosur");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("7708652326");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox3")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		List<WebElement> lin = driver.findElements(By
				.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
		System.out.println(lin.size());
		for (int i = 0; i < lin.size(); i++) {
			if (lin.get(i).getText().equals("Bulgarian")) {
				lin.get(i).click();
					break;
				}
				
	}
		WebElement skilldropdown = driver.findElement(By.id("Skills"));
		Select sel = new Select(skilldropdown);
		sel.selectByIndex(1);
		WebElement countrydropdown = driver.findElement(By.id("countries"));
		Select sel1 = new Select(countrydropdown);
		sel1.selectByIndex(3);
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		List<WebElement> countrylist = driver.findElements(By
				.xpath("//ul[@id='select2-country-results']/li"));
		System.out.println(countrylist.size());
		for (int i = 0; i < countrylist.size(); i++) {
			if (countrylist.get(i).getText().equals("Hong Kong")) {
				countrylist.get(i).click();
				break;

			}

		}
		WebElement yeardropdown= driver.findElement(By.id("yearbox"));
		Select sel3 = new Select(yeardropdown);
		sel3.selectByValue("1996");
		
		WebElement monthdropdown=driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select sel4 = new Select(monthdropdown);
		sel4.selectByVisibleText("January");
		
		WebElement daydropdown= driver.findElement(By.id("daybox"));
		Select sel5 = new Select(daydropdown);
		sel5.selectByIndex(7);
		
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("12345");
		driver.findElement(By.id("submitbtn")).click();

	}

}
