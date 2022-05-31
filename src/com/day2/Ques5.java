package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques5 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://infinity.icicibank.com/corp/Login.jsp";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement userTxt = driver.findElement(By.name("DUMMY1"));
		userTxt.click();
		
		WebElement userTxt1 = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		userTxt1.sendKeys("Poovizhi");
		
		WebElement passTxt = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		passTxt.sendKeys("Flower");
		
}
}
