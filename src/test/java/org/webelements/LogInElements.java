package org.webelements;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LogInElements extends BaseClass {

	public LogInElements() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(id = "email")
	private WebElement username;
	
	//AND
	@CacheLookup
	@FindBys({

			@FindBy(id = "pass"), 
			@FindBy(xpath = "//input[@data-testid='royal_pass']") 
			})
	private WebElement password;
	
	//OR
	@CacheLookup
	@FindAll({
		@FindBy(xpath = "//button[@value='1']"),
		@FindBy(xpath = "//button[@name='login']")
			
	})
	private WebElement loginBtn;
	

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

}
