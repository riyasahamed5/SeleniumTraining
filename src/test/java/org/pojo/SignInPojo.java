package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Baseclass;

public class SignInPojo extends Baseclass {
	
	
	public SignInPojo() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[text()='Sign up for Facebook']")
	private WebElement createNew;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement first;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement second;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement mobile;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;
	
	

	public WebElement getCreateNew() {
		return createNew;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getSecond() {
		return second;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getPass() {
		return pass;
	}
	
	
	
	
}
