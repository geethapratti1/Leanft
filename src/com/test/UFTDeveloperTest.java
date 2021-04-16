package com.test;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.ModifiableSDKConfiguration;
import com.hp.lft.sdk.SDK;
import com.hp.lft.sdk.web.*;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;

import unittesting.UnitTestClassBase;

import org.junit.Test;
import java.net.URI;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class UFTDeveloperTest extends UnitTestClassBase {

	public UFTDeveloperTest() {
		// Change this constructor to private if you supply your own public constructor
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new UFTDeveloperTest();
		globalSetup(UFTDeveloperTest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws GeneralLeanFtException, ReportException {
		try {

			Browser browser = BrowserFactory.launch(BrowserType.CHROME);
			// Navigate to amazon site
			browser.navigate("https://www.amazon.in/");
			browser.openNewTab();
			Link signInLink = browser.describe(Link.class,
					new LinkDescription.Builder().innerText("Sign in").index(0).build());
			signInLink.click();
			browser.sync();
			//
			browser.describe(EditField.class, new EditFieldDescription.Builder().id("ap_email").build())
					.setValue("geetha.mandavilli@gmail.com");
			Button continueButton = browser.describe(Button.class,
					new ButtonDescription.Builder().buttonType("submit").build());
			continueButton.click();

			EditField passwordEditField = browser.describe(EditField.class,
					new EditFieldDescription.Builder().name("password").tagName("INPUT").type("password").build());
			passwordEditField.setSecure("606702da0c90587a3b3e7d3f5e4349a6650658ce281b");
			Button signInButton = browser.describe(Button.class,
					new ButtonDescription.Builder().accessibilityName("            Sign-In          ")
							.buttonType("submit").name("Submit Query").role("").tagName("INPUT").build());
			signInButton.click();
			browser.sync();
		} catch (AssertionError ex) {
			Reporter.reportEvent("Exception", "Test Failed", Status.Failed, ex);
			throw ex;
		}
	}
}
