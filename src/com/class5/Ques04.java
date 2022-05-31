package com.class5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques04 {
public static void main (String[]args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url ="https://www.shopclues.com/wholesale.html";
	driver.get(url);
	driver.manage().window().maximize();
	
	WebElement mobilesAndMore = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
	Actions a = new Actions(driver);
	a.moveToElement(mobilesAndMore).perform();
	Thread.sleep(1000);
	
	WebElement smartPhonesAndTablets = driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']"));
	smartPhonesAndTablets.click();
	Thread.sleep(2000);
	
	WebElement ranges = driver.findElement(By.xpath("//label[@for='Above 5000']"));
	ranges.click();
	Thread.sleep(2000);
	
	WebElement range = driver.findElement(By.xpath("//label[text()=' Above 5000 ()']"));
	range.click();
}
}
