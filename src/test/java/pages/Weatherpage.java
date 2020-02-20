package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Weatherpage {
	WebDriver webDriver;

	By detailedMapButton = By.linkText("Detailed map");

	public Weatherpage(WebDriver webDriver){
		this.webDriver = webDriver;
	}

	public Weatherpage goToWeatherpage(){
		webDriver.get("https://www.bbc.co.uk/weather");
		return this;
	}

	public MapPage clickDetailedMapButton(){
		webDriver.findElement(detailedMapButton).click();
		return new MapPage(webDriver);
	}
}
