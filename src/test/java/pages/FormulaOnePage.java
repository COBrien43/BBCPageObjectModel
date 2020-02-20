package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormulaOnePage {
	WebDriver webDriver;

	By webPageResult = By.linkText("Formula 1");

	public FormulaOnePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public String getWebpageURL(){
		return webDriver.getCurrentUrl();
	}


}
