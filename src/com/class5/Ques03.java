package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques03 {
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
		
		WebElement homeAndFurniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions a = new Actions(driver);
		a.moveToElement(homeAndFurniture).perform();
		Thread.sleep(1000);
		
		WebElement bathTowels = driver.findElement(By.xpath("//a[text()='Bath Towels']"));
		bathTowels.click();
		Thread.sleep(1000);
		
		WebElement bathTowelsName = driver.findElement(By.xpath("(//a[text()='Raymond Home Cotton 340 GSM Hand Towel Set'])[1]"));
		String text = bathTowelsName.getText();
		System.out.println(text);
	}
}
