package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques7 {
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.cleartrip.com/trains";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement fromTxt = driver.findElement(By.xpath("//input[@title='From station']"));
		fromTxt.sendKeys("Erode");
		
		WebElement toTxt = driver.findElement(By.xpath("//input[@title='To station']"));
		toTxt.sendKeys("Chennai Central");
		
		WebElement classTxt = driver.findElement(By.xpath("//select[@title='Class']"));	
		classTxt.sendKeys("first Class");
		
		WebElement adultsTxt = driver.findElement(By.xpath("//select[@id='train_adults']"));	
		adultsTxt.sendKeys("2");
		
		WebElement childrenTxt = driver.findElement(By.xpath("//select[@id='train_children']"));		
		childrenTxt.sendKeys("1");
		
		WebElement seniormenTxt = driver.findElement(By.xpath("//select[@id='train_male_seniors']"));			
		seniormenTxt.sendKeys("1");
		
		WebElement seniorwomenTxt = driver.findElement(By.xpath("//select[@id='train_female_seniors']"));	
		seniorwomenTxt.sendKeys("1");	
		
		WebElement dateTxt = driver.findElement(By.xpath("//input[@title='Journey date']"));
		dateTxt.sendKeys("23/06/2022");
		
		WebElement searchBtnTxt = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		searchBtnTxt.click();
}
}
