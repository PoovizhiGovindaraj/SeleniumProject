package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques12 {
public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.adactin.com/HotelApp/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement userTxt = driver.findElement(By.id("username"));
		userTxt.sendKeys("Poovizhi");
		
		WebElement passTxt = driver.findElement(By.name("password"));
		passTxt.sendKeys("Flower");
}
}
