package com.class7a1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques10 {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobiles.click();
		Thread.sleep(1000);
		
		WebElement mobAcc = driver.findElement(By.xpath("(//span[contains(text(),'& Accessories')])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(mobAcc).perform();
		Thread.sleep(1000);
		
		WebElement mobBrands = driver.findElement(By.xpath("//h3[(text()='Mobile brands')]"));
		a.moveToElement(mobBrands).perform();
		Thread.sleep(1000);
		
		WebElement moto = driver.findElement(By.xpath("//a[(text()='Motorola')]"));
		moto.click();
		Thread.sleep(1000);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File source = tk.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\Screenshots\\amazon.png");
		FileUtils.copyFile(source, target);
	}
}
