package com.class9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.snapdeal.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("keyword")).sendKeys("iphone 7");
		driver.findElement(By.xpath("//button[contains(@class,'searchform')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//p[contains(@class,'product-tit')])[1]")).click();
		
		String pWin = driver.getWindowHandle();
		Set <String> allWin = driver.getWindowHandles();
		for(String x : allWin) {
			if(!x.equals(pWin)) {
				driver.switchTo().window(x);
				}
			}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		WebElement youPay = driver.findElement(By.xpath("(//span[text()='Rs. 249'])[2]"));
		String text = youPay.getText();
		System.out.println(text);
	}
}
