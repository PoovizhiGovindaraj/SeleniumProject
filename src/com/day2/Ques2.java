package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.redbus.in/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement fromTxt = driver.findElement(By.id("src"));
		fromTxt.click();
		fromTxt.sendKeys("Erode");
		Thread.sleep(1000);
		
		WebElement toTxt = driver.findElement(By.id("dest"));
		toTxt.sendKeys("Chennai");
		toTxt.click();
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.id("onward_cal"));
		date.sendKeys("7");
		
}
}
