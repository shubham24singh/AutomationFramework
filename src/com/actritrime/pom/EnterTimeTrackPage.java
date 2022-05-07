package com.actritrime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	
 @FindBy(xpath="//div[text()='Tasks']")
 private WebElement tasktab;
 @FindBy(id="logoutLink")
 private WebElement lgbtn;
 
 public EnterTimeTrackPage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }

public void setTasktab() {
	tasktab.click();
}
public void setLgbtn() {
	lgbtn.click();
}
 
}
