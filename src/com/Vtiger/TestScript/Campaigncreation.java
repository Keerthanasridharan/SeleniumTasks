package com.Vtiger.TestScript;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Vtiger.genericlibraries.Datautility;

public class Campaigncreation {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		Datautility obj=new Datautility();
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\New Chrome D\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(obj.getDatafromproperty("url"));
		driver.findElement(By.id("username")).sendKeys(obj.getDatafromproperty("username"));
		driver.findElement(By.id("password")).sendKeys(obj.getDatafromproperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='app-icon fa fa-bars']/../..")).click();
		WebElement MarketingTarget=driver.findElement(By.xpath("//div[@id='MARKETING_modules_dropdownMenu']"));
		Actions ab=new Actions(driver);
		ab.moveToElement(MarketingTarget).perform();
		driver.findElement(By.xpath("//a[@title='Campaigns']")).click();
//		driver.findElement(By.xpath("//button[@id='Campaigns_listView_basicAction_LBL_ADD_RECORD']")).click();
//		driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys(obj.getDatafromExcel("Campaigns", 0, 2));
//		driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).click();
//		String text = driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText();
//		System.out.println(text);
//		String Month = text.split(" ")[0].trim();
//		String Year = text.split(" ")[1].trim();
//		System.out.println(Month);
//		System.out.println(Year);
//		
//		while((Month.equals("June")&& Year.equals("2021")))
//		{
//			driver.findElement(By.className("next")).click();
//			 text = driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText();
//			System.out.println(text);
//			 Month = text.split(" ")[0].trim();
//			 Year = text.split(" ")[1].trim();
//			System.out.println(Month);
//			System.out.println(Year);
//			
//		}
		
//		driver.findElement(By.xpath("//td[text()='17']")).click();
//		driver.findElement(By.xpath("//button[text()='Save']")).click();
driver.findElement(By.xpath("//p[@title='All']")).click();
	driver.findElement(By.xpath("//input[@type='checkbox'  and @value='20']")).click();
	driver.findElement(By.xpath("//button[@id='Campaigns_listView_massAction_LBL_DELETE']")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("//button[@data-bb-handler='confirm']"))));
	driver.findElement(By.xpath("//button[@data-bb-handler='confirm']")).click();
}
	
}
