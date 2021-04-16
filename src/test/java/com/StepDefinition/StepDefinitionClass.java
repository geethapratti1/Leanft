package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Pom.pom_1;
import com.base.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionClass extends Baseclass {

	@Given("User should launch the browser.")
	public void user_should_launch_the_browser() {
		chromeBrowserLaunch();
		LaunchURL("https://www.facebook.com/");
	}

	@When("User should login with {string} and {string}")
	public void user_should_login_with_and(String string, String string2) {
//		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
//		email.sendKeys(string);
//		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
//		pwd.sendKeys(string2);
		
//		WebElement login = driver.findElement(By.name("login"));
//		login.click();
		pom_1 p1 = new pom_1();
		 p1.getEmail().sendKeys(string);
		//sendKeys(p1.getEmail(), string);
		 p1.getPwd().sendKeys(string2);
		//sendKeys(p1.getPwd(), string2);
		String attribute = p1.getPwd().getAttribute("value");
		Assert.assertEquals(string2, attribute);
		System.out.println("Valid Password");
		p1.getLoginbutton().click();
		driver.quit();
	}

}
