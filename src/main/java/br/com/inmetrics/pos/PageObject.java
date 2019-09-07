package br.com.inmetrics.pos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.inmetrics.cfg.Constants;


public abstract class PageObject {
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected int navBarOffsetY;

	protected PageObject(WebDriver driver, int navBarOffsetY) {
		this(driver, navBarOffsetY, Constants.DEFAULT_WAIT_TIMEOUT);
	}
	
	protected PageObject(WebDriver driver, int navBarOffsetY, int timeout) {
		this.driver = driver;
		this.navBarOffsetY = navBarOffsetY;
		this.wait = new WebDriverWait(driver, timeout);
		PageFactory.initElements(driver, this);
	}
	
	protected void scrollTo(WebElement element) {
		scrollTo(element, 0);
	}
	
	protected void scrollTo(WebElement element, int offsetY) {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + (element.getLocation().y + offsetY) + ");");
	}
	
	protected void click(WebElement element) {
		try {
            element.click();
        } catch (WebDriverException e) {
            try {
                scrollTo(element);
                wait.until(ExpectedConditions.elementToBeClickable(element));
                element.click();
            } catch (WebDriverException e2) {
                scrollTo(element, -navBarOffsetY);
                element.click();
            }
        }
	}
	
}
