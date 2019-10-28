package testcases;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ApplicationPage;
import pages.MonthDPage;
import utilities.BrowserFactory;

public class Tests {

	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		driver = BrowserFactory.startBrowser();
	}
	

	@Test(priority = 0)
	public void addCategory() throws InterruptedException {

		ApplicationPage appPage = PageFactory.initElements(driver, ApplicationPage.class);
		appPage.addACategory("Trial By q");
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void noDuplication() throws InterruptedException {

		ApplicationPage appPage = PageFactory.initElements(driver, ApplicationPage.class);
		appPage.addACategory("Trial By q");
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void MonthDropDownList() throws InterruptedException {
		MonthDPage monthDropDownList = PageFactory.initElements(driver, MonthDPage.class);
		assertTrue(monthDropDownList.MonthDropDownList1());

	}

	@AfterSuite
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}
}
