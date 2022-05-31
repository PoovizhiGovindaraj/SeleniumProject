package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques15 {
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
		
		WebElement target1 = driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]"));
		target1.click();
		
		WebElement userText = driver.findElement(By.name("customerName"));
		userText.sendKeys("Poovizhi G");
		
		WebElement phnNum = driver.findElement(By.name("email"));
		phnNum.sendKeys("9976827879");
		
		WebElement mail = driver.findElement(By.id("ap_email"));
		mail.sendKeys("poovizhidhana@gmail.com");
		
		WebElement passText = driver.findElement(By.name("password"));
		passText.sendKeys("Flower");
		
		
	}
}
