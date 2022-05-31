package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://twitter.com/login";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement userTxt = driver.findElement(By.name("text"));
		userTxt.sendKeys("Poovizhidhana@gmail.com");
		
		WebElement nextBtn = driver.findElement(By.name("pass"));
		nextBtn.click();
		
}
}
