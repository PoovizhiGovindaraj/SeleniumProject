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

public class Ques04 {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		

		WebElement userText = driver.findElement(By.name("email"));
		WebElement passText = driver.findElement(By.name("pass"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Poovizhidhana@gmail.com')", userText);
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('value','Flower')", passText);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click()", loginBtn);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File source = tk.getScreenshotAs(OutputType.FILE);
		String title = driver.getTitle();
		File target = new File("C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\Screenshots\\fb"+title+".png");
		FileUtils.copyFile(source, target);
	}
}
