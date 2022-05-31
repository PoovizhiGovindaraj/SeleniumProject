package com.class9;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques3 {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.homedepot.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("headerSearch")).sendKeys("Ceiling Fan");
		driver.findElement(By.xpath("//button[contains(@class,'SearchBox')]")).click();
		Thread.sleep(1000);
		
		WebElement ceilingFan = driver.findElement(By.xpath("(//div[contains(@class,'visual')])[1]"));
		
		Actions a = new Actions(driver);
		a.contextClick(ceilingFan).perform();
		Thread.sleep(1000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		String pWin = driver.getWindowHandle();
		Set <String> allWin = driver.getWindowHandles();
		for(String x : allWin) {
			if(!x.equals(pWin)) {
				driver.switchTo().window(x);
				}
			}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[contains(@class,'product-pod')])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Remote Included']")).click();
	}
}
