package com.projrectclass;
import java.io.File;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Flipkart {
public static void main(String[]args) throws  Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.flipkart.com/";
	driver.get(url);
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String cUrl = driver.getCurrentUrl();
	System.out.println(cUrl);
	boolean b = url.equals(cUrl);
	System.out.println(b);
	if(b=true) {System.out.println("Pass");	
	}else System.out.println("Fail");
	Thread.sleep(1000);
	
	WebElement clsButn = driver.findElement(By.xpath("//button[text()='✕']"));
	clsButn.click();
	
	WebElement fashion = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[4]"));
	Actions a = new Actions(driver);
	a.moveToElement(fashion).perform();
	WebElement winter = driver.findElement(By.xpath("//a[text()='Winter']"));
	a.moveToElement(winter).perform();
	WebElement kidsJackets = driver.findElement(By.xpath("//a[text()='Kids Jackets']"));
	a.moveToElement(kidsJackets).perform();
	kidsJackets.click();
	Thread.sleep(3000);
	WebElement product = driver.findElement(By.xpath("(//a[text()='VK Full-Zip B Full Sleeve Printed Boys Sports Jacket'])[1]"));
	product.click();
	String text = product.getText();
	System.out.println(text);
	Thread.sleep(5000);
	
	String pWin = driver.getWindowHandle();
	Set<String> allWin = driver.getWindowHandles();
	for(String x : allWin) {
		if(!x.equals(pWin)) {
			driver.switchTo().window(x);}}
	driver.findElement(By.xpath("//a[text()='7 - 8 Years']")).click();
	Thread.sleep(1000);
	WebElement addToCart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
	addToCart.click();
	
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File target = new File("C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\Screenshots\\flipkart"+title+".png");
	FileUtils.copyFile(source, target);
	}
}

