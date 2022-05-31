package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("(//button[@aria-label='Close modal'])[2]")).click();
	}
}
