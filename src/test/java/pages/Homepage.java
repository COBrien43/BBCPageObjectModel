package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver webDriver;

	By weatherButton = By.linkText("Weather");
	By sportButton = By.linkText("Sport");

	public Homepage (WebDriver webDriver){
		this.webDriver = webDriver;
	}

	public Homepage goToHomepage(){
		webDriver.get("https://www.bbc.co.uk");
		return this;
	}

	public Weatherpage selectWeatherButton(){
		webDriver.findElement(weatherButton).click();
		return new Weatherpage(webDriver);
	}

	public Sportpage selectSportButton(){
		webDriver.findElement(sportButton).click();
		return new Sportpage(webDriver);
	}
}
