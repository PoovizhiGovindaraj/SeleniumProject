package com.projrectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[]args) throws  Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.techlistic.com/p/demo-selenium-practice.html";
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
	
	WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	List<WebElement> tRows = table.findElements(By.tagName("tr"));
	for(WebElement d : tRows) {
		List<WebElement> tData = table.findElements(By.tagName("td"));
				for(WebElement y : tData) {
					String txt = y.getText();
					System.out.println(txt);
				}
	}
	}
}
