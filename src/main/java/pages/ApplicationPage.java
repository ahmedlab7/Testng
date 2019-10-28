package pages;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ApplicationPage {

	WebDriver driver; // global

	// Every Page must have a constructor to invite the driver
	public ApplicationPage(WebDriver driver) {
		this.driver = driver;
	}

	// Test 1: Validate a user is able to add a category
	// and once the category is added it should display.

	// Element Library
	@FindBy(how = How.NAME, using = "data")
	WebElement CategoryTextBox;
	@FindBy(how = How.XPATH, using = "//input[@value = 'Add']")
	WebElement AddACategoryButton;
	@FindBy(how = How.LINK_TEXT, using = "Back")
	WebElement BackButton;
	@FindBy(how = How.XPATH, using = "//body[contains(text(), 'Sorry that TODO item already exists. ')]")
	WebElement WarningMessage;

	public void addACategory(String name) throws InterruptedException {
		CategoryTextBox.click();
		CategoryTextBox.sendKeys(name);
		AddACategoryButton.click();
		
		assertTrue(isWarningMessageDisplayed());
		backButton();
		

	}

	public void backButton() throws InterruptedException {
		BackButton.click();
		
	}

	public boolean isWarningMessageDisplayed() {
	//	String text = "Sorry that TODO item already exists.";
		//Assert.assertEquals(text, WarningMessage);
		return WarningMessage.isDisplayed();
	}

}
