package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://toolsqa.com/handling-alerts-using-selenium-webdriver/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("")).click();
	}
}
