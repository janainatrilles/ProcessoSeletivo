package br.com.inmetrics.pos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.inmetrics.cfg.Constants;

public class InmetricsHome extends PageObject {

	@FindBy(xpath = "//*[@id=\"carreiras\"]/div/div/a")
	private WebElement buttonVagas;
	
	public InmetricsHome(WebDriver driver) {
		super(driver, Constants.INMETRICS_HOME_NAVBAR_OFFSET_Y);
	}

	public void acesseVagas() {
		click(buttonVagas);
	}
}
