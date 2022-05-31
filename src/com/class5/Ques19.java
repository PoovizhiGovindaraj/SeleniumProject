package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques19 {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://www.flipkart.com";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement clsBtn = driver.findElement(By.xpath("//button[text()='✕']"));
		clsBtn.click();
		
		WebElement mobiles = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		mobiles.click();
		Thread.sleep(1000);
		
		WebElement target1 = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a = new Actions(driver);
		a.moveToElement(target1).perform();
		Thread.sleep(1000);
		
		WebElement target2 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.moveToElement(target2).perform();
		
		WebElement target3 = driver.findElement(By.xpath("//a[text()='Realme']"));
		target3.click();
		Thread.sleep(2000);
		
		WebElement target4 = driver.findElement(By.xpath("//img[@alt='realme C11 2021 (Cool Grey, 32 GB)']"));
		target4.click();
	}
}
