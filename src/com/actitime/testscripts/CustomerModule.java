package com.actitime.testscripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actritrime.pom.EnterTimeTrackPage;
import com.actritrime.pom.LoginPage;
import com.actritrime.pom.TaskListPage;

public class CustomerModule extends BaseClass{

	@Test
	public void createCustomer() throws IOException, InterruptedException {
		FileLib file=new FileLib();
		String custName=file.getExcelData("Create Customer", 1, 2);
		String custdesc=file.getExcelData("Create Customer", 1, 3);
	    EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	    e.setTasktab();
	    TaskListPage t=new TaskListPage(driver);
	    t.getAddnewbtn().click();
	    t.getAddnewcust().click();
	    t.getEntercustname().sendKeys(custName);
	    t.getEntercustdesc().sendKeys(custdesc);
	    t.getSelectcust().click();
	    t.getSelectourcompany();//it will select but you can not see it will happen in backened.
	    t.getCreatecustbtn().click();
	    WebDriverWait wait=new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.textToBePresentInElement(t.getVerifycustname(), custName));
	    String actualCustName=t.getVerifycustname().getText();
	   Assert.assertEquals(actualCustName, custName);
	   Reporter.log("Successfully Created"+custName,true);
	   file.setExcelData("Create Customer",1, 4, "Pass");
	    
	}
}
