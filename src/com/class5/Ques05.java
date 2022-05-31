package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques05 {
	public static void main (String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.shopclues.com/wholesale.html";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement sportsAndMore = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions a = new Actions(driver);
		a.moveToElement(sportsAndMore).perform();
		Thread.sleep(1000);
		
		WebElement weightGainers = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		weightGainers.click();
		Thread.sleep(1000);
	}
}
