package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class pom_1 extends Baseclass {
	public pom_1() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(name ="login")
	private WebElement loginbutton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
}











