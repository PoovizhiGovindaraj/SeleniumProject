package com.sel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTask {
	public static void main (String[]args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	String url = "https://facebook.com/";
	driver.get(url);
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String cUrl = driver.getCurrentUrl();
	System.out.println(cUrl);
	driver.quit();
	boolean c = url.equals(cUrl);
	System.out.println(c);  
	if(c==true) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	}}
