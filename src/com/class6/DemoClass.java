package com.class6;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoClass {
public static void main (String[]args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url="https://www.facebook.com/";
	driver.get(url);
	driver.manage().window().maximize();
	
	WebElement userText = driver.findElement(By.id("email"));
	String mail = "Poovizhi";
	userText.sendKeys(mail);
	
	Actions a = new Actions(driver);
	a.doubleClick(userText).contextClick(userText).build().perform();
	
	Robot r = new Robot();
	for(int i=0;i<7;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V );
	
	WebElement passText = driver.findElement(By.id("pass"));
	String att = passText.getAttribute("value");
	System.out.println(att);
	System.out.println(mail);
	
	boolean e = mail.equals(att);
	System.out.println(e);
	
	if(e = true) {
	System.out.println("Pass");
	}else
	System.out.println("Fail");
	
}
}
