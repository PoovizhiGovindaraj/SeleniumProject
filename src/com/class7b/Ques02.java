package com.class7b;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques02 {
	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://toolsqa.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		WebElement clsBtn = driver.findElement(By.xpath("(//button[@aria-label='Close modal'])[2]"));
		clsBtn.click();
		
		WebElement btmEle = driver.findElement(By.xpath("//div[text()='Checkout what our Students say about us!']"));
		WebElement upEle = driver.findElement(By.xpath("//a[@class='btn btn-border active']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",btmEle);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)",upEle);
	}
}
