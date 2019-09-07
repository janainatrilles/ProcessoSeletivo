package br.com.inmetrics.cfg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;


public class Browser {

	private static WebDriver driver;
	
	private static WebDriver chrome() {
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.setCapability("applicationCacheEnabled", "false");

        WebDriver browser = new ChromeDriver(options);

        browser.manage().window().maximize();
        return browser;
    }
	
	@Before
    public static void setup() {
		driver = chrome();
    }
	
	public static WebDriver driver() {
		return driver;
	}
	
}
