package com.actritrime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement addnewcust;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement entercustname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustdesc;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectcust;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow selected']")
	private WebElement selectourcompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcustbtn;
	
	@FindBy(xpath="(//div[@class='editButton'])[last()]/../div[1]")
	private WebElement verifycustname;
	
	public WebElement getVerifycustname() {
		return verifycustname;
	}

	public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getAddnewcust() {
		return addnewcust;
	}

	public WebElement getEntercustname() {
		return entercustname;
	}

	public WebElement getEntercustdesc() {
		return entercustdesc;
	}

	public WebElement getSelectcust() {
		return selectcust;
	}

	public WebElement getSelectourcompany() {
		return selectourcompany;
	}

	public WebElement getCreatecustbtn() {
		return createcustbtn;
	}
	
}
