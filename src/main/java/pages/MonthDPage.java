package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MonthDPage  {

	WebDriver driver;

	public MonthDPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]")
	WebElement listOfMonth;

	public Boolean MonthDropDownList1() {
		Boolean x = false;
		String months[] = { "None", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
				"Dec" };
		Select select = new Select(listOfMonth);
		List<WebElement> dropdownvalues = select.getOptions();

		for (int i = 0; i < dropdownvalues.size(); i++) {
			Assert.assertEquals(months[i], dropdownvalues.get(i).getText());
			x = true;
		}

		return x;

	}

}