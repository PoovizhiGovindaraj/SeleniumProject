package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques16 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.automationtesting.in/register.html";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement userTxt = driver.findElement(By.id("email"));
		userTxt.sendKeys("Poovizhi");
		Thread.sleep(1000);
		
		WebElement passTxt = driver.findElement(By.name("pass"));
		passTxt.sendKeys("Flower");
		Thread.sleep(1000);
		
		WebElement btnTxt = driver.findElement(By.xpath(" //button[@name='login']"));
		btnTxt.click();	
}
}
