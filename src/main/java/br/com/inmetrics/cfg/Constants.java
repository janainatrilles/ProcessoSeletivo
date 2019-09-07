package br.com.inmetrics.cfg;

public class Constants {
	public static final String CHROMEDRIVER_PATH = Browser.class.getProtectionDomain().getCodeSource().getLocation().getPath() 
			+ "../../chromedriver/chromedriver.exe";
	public static final int BROWSER_TIMEOUT_SECONDS = 10;
	public static final int INMETRICS_HOME_NAVBAR_OFFSET_Y = 92; // em pixels
	public static int DEFAULT_WAIT_TIMEOUT = 20; // em segundos
	
}
