import io.cucumber.java.en_pirate.Aye;
import io.cucumber.java.en_pirate.Blimey;
import io.cucumber.java.en_pirate.Gangway;
import io.cucumber.java.en_pirate.Letgoandhaul;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyStepdefs {
	DriverFactoryPattern driverFactoryPattern = new DriverFactoryPattern();
	WebDriver webDriver = driverFactoryPattern.getWebDriver("chrome");

	Homepage homepage = new Homepage(webDriver);
	Weatherpage weatherpage = new Weatherpage(webDriver);
	Sportpage sportpage = new Sportpage(webDriver);
	MapPage mapPage;
	FormulaOnePage formulaOnePage;


	@Gangway("I am on the BBC homepage")
	public void iAmOnTheBBCHomepage() {
		homepage.goToHomepage();
	}

	@Blimey("I go to the weather page")
	public void iGoToTheWeatherPage() {
		weatherpage = homepage.selectWeatherButton();
	}

	@Aye("I click on the detailed map and I click on the dropdown menu")
	public void iClickOnTheDetailedMapAndIClickOnTheDropdownMenu() {
		mapPage = weatherpage.clickDetailedMapButton();
	}

	@Letgoandhaul("I will see the detailed map")
	public void iWillSeeTheDetailedMap() throws InterruptedException {
		assertEquals("weathermap__marker__content__text-icon", mapPage.getKeyAndOptionsButton());
		webDriver.quit();
	}

	@Blimey("I go to the Sport page")
	public void iGoToTheSportPage() {
		sportpage = homepage.selectSportButton();
	}

	@Aye("I click on the Formula One tab")
	public void iClickOnTheFormulaOneTab() {
		formulaOnePage = sportpage.clickFormulaOneButton();
	}

	@Letgoandhaul("I will see the Formula One Page")
	public void iWillSeeTheFormulaOnePage() {
		assertEquals("https://www.bbc.co.uk/sport/formula1", formulaOnePage.getWebpageURL());
		webDriver.quit();
	}
}
