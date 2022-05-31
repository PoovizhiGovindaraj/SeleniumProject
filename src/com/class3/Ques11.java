package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques11 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement firstNameTxt = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		firstNameTxt.sendKeys("Poovizhi");
		Thread.sleep(1000);
		
		WebElement lastNameTxt = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastNameTxt.sendKeys("Govindaraj");
		Thread.sleep(1000);
		
		WebElement userTxt = driver.findElement(By.xpath("//input[@type='email']"));
		userTxt.sendKeys("Poovizhidhana2");
		Thread.sleep(1000);
		
		WebElement passTxt = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		passTxt.sendKeys("Flower@123");
		Thread.sleep(1000);
		
		WebElement cpassTxt = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		cpassTxt.sendKeys("Flower@123");
		Thread.sleep(1000);
		
		WebElement nextTxt = driver.findElement(By.className("VfPpkd-vQzf8d"));
		nextTxt.click();
}
}
