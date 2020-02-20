import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactoryPattern {
	private WebDriver webDriver;

	public WebDriver getWebDriver(String browser){
		switch(browser){
			case "chrome":
				webDriver = new ChromeDriver();
				break;

			case "edge":
				System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
				webDriver = new EdgeDriver();
				break;

			case "firefox":
				webDriver = new FirefoxDriver();
				break;
		}
		return webDriver;
	}
}
