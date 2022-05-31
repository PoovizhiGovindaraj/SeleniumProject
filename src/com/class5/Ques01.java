 package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques01 {
public static void main (String[]args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "http://demo.guru99.com/test/drag_drop.html";
	driver.get(url);
	driver.manage().window().maximize();
	
	WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement target = driver.findElement(By.xpath("//ol[@id='bank']/li"));
	
	WebElement source1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement target1 = driver.findElement(By.xpath("(//ol[@align='center']/li)[2]"));
	
	WebElement source2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement target2 = driver.findElement(By.xpath("(//ol[@align='center']/li)[3]"));
	
	WebElement source3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement target3 = driver.findElement(By.xpath("(//ol[@align='center']/li)[4]"));
	
	Actions a = new Actions(driver);
	a.dragAndDrop(source, target).perform();
	a.dragAndDrop(source1, target1).perform();
	a.dragAndDrop(source2, target2).perform();
	a.dragAndDrop(source3, target3).perform();
	
	WebElement source4 = driver.findElement(By.xpath("//a[text()='Perfect!']"));
	String text = source4.getText();
	System.out.println(text);
	
	boolean expectedText = text.equals("Perfect!");
	System.out.println(expectedText);
	
	if(expectedText == true) {
	System.out.println("Pass");
	}else
	System.out.println("Fail");

}
}

