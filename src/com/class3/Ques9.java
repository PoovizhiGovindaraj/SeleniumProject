package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques9 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement userTxt = driver.findElement(By.xpath("(//input[@type='text'])[2] "));
		userTxt.sendKeys("Poovizhidhana@gmail.com");
		Thread.sleep(1000);
		
		WebElement passTxt = driver.findElement(By.xpath("//input[@type='password'] "));
		passTxt.sendKeys("Flower");
		Thread.sleep(1000);
		
		WebElement loginBtnTxt = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		loginBtnTxt.click();
}
}
