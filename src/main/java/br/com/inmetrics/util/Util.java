package br.com.inmetrics.util;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public abstract class Util {
	private static void focar(WebDriver driver, WebElement elemento) {
		focar(driver, elemento, 0);
	}

	private static void focar(WebDriver driver, WebElement elemento, int offsetY) {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + (elemento.getLocation().y + offsetY) + ");");
	}

	public static void click(WebDriver driver, WebElement elemento) {
		try {
			elemento.click();
		} catch (WebDriverException e) {
			focar(driver, elemento);
			elemento.click();
		}
	}

	public static void sendKeys(WebDriver driver, WebElement elemento, Keys key) {
		try {
			elemento.sendKeys(key);
		} catch (WebDriverException e) {
			focar(driver, elemento);
			elemento.sendKeys(key);
		}
	}

	public static void esperaBloqueante(long s) {
		esperaBloqueanteMs(s * 1000);
	}

	public static void esperaBloqueanteMs(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String join(String s1, String s2) {
		if (StringUtils.isBlank(s1))
			return s2;
		else if (StringUtils.isBlank(s2))
			return s1;
		else
			return String.join(" ", s1, s2);
	}

}
