package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques10 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.instagram.com/accounts/login/?hl=en";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement userTxt = driver.findElement(By.name("username"));
		userTxt.sendKeys("Poovizhi");
		Thread.sleep(1000);
		
		WebElement passTxt = driver.findElement(By.name("password"));
		passTxt.sendKeys("Flower");
		
}
}
