package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques13 {
	public static void main (String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.snapdeal.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		Thread.sleep(1000);
		
		WebElement target1 = driver.findElement(By.xpath("//span[text()='Printed Back Covers']"));
		target1.click();
	}
}
