package com.class7a1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ques10a {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement moto = driver.findElement(By.id("twotabsearchtextbox"));
		moto.sendKeys("Motorola");
		Thread.sleep(1000);
		
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		Thread.sleep(1000);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File source = tk.getScreenshotAs(OutputType.FILE);
		String title = driver.getTitle();
		File target = new File("C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\Screenshots\\amazon"+title+".png");
		FileUtils.copyFile(source, target);
	}
}
