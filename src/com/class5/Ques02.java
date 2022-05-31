package com.class5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques02 {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://www.amazon.in";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement target = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		Thread.sleep(1000);
		
		WebElement target1 = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		target1.click();
		
	}	
}
