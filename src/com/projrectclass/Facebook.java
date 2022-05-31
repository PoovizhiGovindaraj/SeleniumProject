package com.projrectclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Facebook {
public static void main(String[]args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe")	;
WebDriver driver = new ChromeDriver();
String url ="https://www.facebook.com/";
driver.get(url);
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);
String cUrl = driver.getCurrentUrl();
System.out.println(cUrl);
boolean a = url.equals(cUrl);
System.out.println(a);
if(a = true) {System.out.println("Pass");
}else System.out.println("Fail");
Thread.sleep(2000);

WebElement createNewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
createNewAccount.click();
Thread.sleep(2000);
WebElement firstName = driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]"));
firstName.sendKeys("Poovizhi");
WebElement surName = driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
surName.sendKeys("Govindaraj");
WebElement eMail = driver.findElement(By.xpath("(//input[contains(@type,'text')])[4]"));
eMail.sendKeys("Poovizhidhana@gmail.com");
WebElement newPassword = driver.findElement(By.id("password_step_input"));
newPassword.sendKeys("Flower");
Thread.sleep(2000);

WebElement dateDropDown = driver.findElement(By.id("day"));
dateDropDown.click();
Select s = new Select(dateDropDown);
s.selectByIndex(11);
WebElement monthDropDown = driver.findElement(By.id("month"));
monthDropDown.click();
Select t = new Select(monthDropDown);
t.selectByValue("10");
WebElement yearDropDown = driver.findElement(By.id("year"));
yearDropDown.click();
Select u = new Select(yearDropDown);
u.selectByVisibleText("1996");
Thread.sleep(2000);

WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
gender.click();
Thread.sleep(2000);

WebElement signUp = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
signUp.click();
}
}
