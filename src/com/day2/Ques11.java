package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques11 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.irctc.co.in/";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		
		WebElement okBtn = driver.findElement(By.className("btn btn-primary"));
		okBtn.click();
		
		
}
}
