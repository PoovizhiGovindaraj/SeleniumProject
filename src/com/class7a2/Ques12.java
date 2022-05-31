package com.class7a2;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques12 {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.snapdeal.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement hpLap = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		hpLap.sendKeys("HP Laptop");
		Thread.sleep(1000);
		
		WebElement search = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		search.click();
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File source = tk.getScreenshotAs(OutputType.FILE);
		String title = driver.getTitle();
		File target = new File("C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\Screenshots\\snapdeal.png");
		FileUtils.copyFile(source, target);
	}
}
