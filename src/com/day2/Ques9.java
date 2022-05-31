package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques9 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.snapdeal.com/login";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement emailTxt = driver.findElement(By.id("userName"));
		emailTxt.sendKeys("poovizhidhana@gmail.com"); 
		Thread.sleep(1000);
		
}
}
