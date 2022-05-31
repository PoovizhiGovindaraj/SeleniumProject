package com.class9;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques1 {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.amazon.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("field-keywords")).sendKeys("iphone X");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		WebElement iPhoneX = driver.findElement(By.xpath("(//h2[contains(@class,'a-size-')])[1]"));
		
		Actions a = new Actions(driver);
		a.contextClick(iPhoneX).perform();
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
		Thread.sleep(5000);
		
		driver.findElement(By.name("5")).click();
		Thread.sleep(3000);
		
		WebElement costOfProduct = driver.findElement(By.xpath("(//span[text()='$329.99'])[2]"));
		String text = costOfProduct.getText();
		System.out.println(text);
	}
}
