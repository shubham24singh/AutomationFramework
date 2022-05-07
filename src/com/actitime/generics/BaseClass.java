package com.actitime.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actritrime.pom.EnterTimeTrackPage;
import com.actritrime.pom.LoginPage;

public class BaseClass {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static WebDriver driver;
@BeforeTest
public void openBrowser() throws IOException {
 driver= new ChromeDriver();
 driver.manage().window().maximize();
 WebDriverCommonLib w=new WebDriverCommonLib();
 w.waitForLoad(driver);
}
@AfterTest
public void closeBrowser() {

}
@BeforeMethod
public void login() throws IOException {
 FileLib f=new FileLib();
 String url = f.getPropertyData("Url");
 String un=f.getPropertyData("UN");
 String pw=f.getPropertyData("Pwd");
 LoginPage l=new LoginPage(driver);
 driver.get(url);
 l.setLogin(un, pw);
}
@AfterTest
public void logout() {
EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
e.setLgbtn();
	
}
}
