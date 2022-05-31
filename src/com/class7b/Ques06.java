package com.class7b;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques06 {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.flipkart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement userText = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebElement passText = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement loginBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Poovizhidhana@gmail.com')", userText);
		Object o =  js.executeScript("return arguments[0].getAttribute('type')", userText);
		String g = String.valueOf(o);
		System.out.println(g);
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].setAttribute('value','Flower')", passText);
		Object p =  js.executeScript("return arguments[0].getAttribute('type')", passText);
		String h = String.valueOf (p);
		System.out.println(h);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click()", loginBtn);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File source = tk.getScreenshotAs(OutputType.FILE);
		String title = driver.getTitle();
		File target = new File("C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\Screenshots\\flipkart"+title+".png");
		FileUtils.copyFile(source, target);
		
		
	}
}
