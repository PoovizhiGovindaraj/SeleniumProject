package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class9 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.snapdeal.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement userTxt = driver.findElement(By.id("email"));
		userTxt.sendKeys("Poovizhi");
		Thread.sleep(1000);
}
}
