package com.hmrc.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSetting {

	public static  WebDriver InitBrowser(BrowserType browser) {
		WebDriver driver = null;
		switch (browser) {
		case Firefox:
			System.setProperty("webdriver.gecko.driver", "/home/timmy/Downloads/Jars/geckodriver");
			driver = new FirefoxDriver();
			break;
			
		case Chrome:
			System.setProperty("webdriver.chrome.driver", "/home/timmy/Downloads/Jars/chromedriver");
			driver = new ChromeDriver();
			break;

		case IExplore:

			System.setProperty("webdriver.ie.driver", "/home/timmy/Downloads/Jars/IEDriverServer");
			driver = new InternetExplorerDriver();
			break;

		default:
			System.setProperty("webdriver.gecko.driver", "/home/timmy/Downloads/Jars/geckodriver");
			driver = new FirefoxDriver();
			break;
		}
		return driver;
	}
}
