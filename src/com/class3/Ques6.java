package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.redbus.in/";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement signInTxt = driver.findElement(By.id("i-icon-profile"));
		signInTxt.click();
		
		Thread.sleep(1000);
		
		WebElement passTxt = driver.findElement(By.id("signin-block"));
		Thread.sleep(1000);
		passTxt.click();
		Thread.sleep(1000);
		
		WebElement btnTxt = driver.findElement(By.xpath(" //button[@name='login']"));
		btnTxt.click();	
}
}
