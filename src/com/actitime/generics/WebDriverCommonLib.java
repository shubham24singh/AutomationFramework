package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WebDriverCommonLib {
public void waitForLoad(WebDriver driver) {
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
}
