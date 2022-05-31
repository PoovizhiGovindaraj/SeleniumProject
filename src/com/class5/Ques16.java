package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques16 {
	public static void main (String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		

		WebElement target = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		Thread.sleep(1000);
	}
}
