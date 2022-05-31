package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement searchTxt = driver.findElement(By.name("q"));
		searchTxt.sendKeys("Career Guidance Technology");
		
}
}
