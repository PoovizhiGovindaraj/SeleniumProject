package com.class7a1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques09 {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.flipkart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement clsBtn = driver.findElement(By.xpath("//button[text()='✕']"));
		clsBtn.click();
		
		WebElement mobiles = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		mobiles.click();
		Thread.sleep(1000);
		
		WebElement iPhone = driver.findElement(By.xpath("(//p[text()='Shop Now'])[6]"));
		iPhone.click();
		Thread.sleep(1000);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File source = tk.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\Screenshots\\fb.png");
		FileUtils.copyFile(source, target);
	}
}
