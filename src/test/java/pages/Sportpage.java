package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sportpage {
	WebDriver webDriver;

	By clickFormulaOneButton = By.linkText("Formula 1");

	public Sportpage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	/*public Sportpage goToSportPage(){
		webDriver.get("https://www.bbc.co.uk/sport");
		return this;
	}*/

	public FormulaOnePage clickFormulaOneButton(){
		webDriver.findElement(clickFormulaOneButton).click();
		return new FormulaOnePage(webDriver);
	}
}
