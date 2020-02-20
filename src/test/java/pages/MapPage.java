package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MapPage {
	WebDriver webDriver;

	By keyAndOptions = By.xpath("//*[@id=\"site-container\"]/section/div/div[6]");
	By windChecked = By.xpath("//*[@id=\"site-container\"]/section/div/div[6]/div/div[7]/label/div[1]");
	By windDirectionButton= By.xpath("//*[@id=\"site-container\"]/section/div/div[1]/div[1]/div[8]/div[2]/div[2]/div[3]");

	public MapPage (WebDriver webDriver){
		this.webDriver = webDriver;
	}

	public String getKeyAndOptionsButton() throws InterruptedException {
		Thread.sleep(3000);
		webDriver.findElement(keyAndOptions).click();
		webDriver.findElement(windChecked).click();
		return webDriver.findElement(windDirectionButton).getAttribute("class");
	}
}
