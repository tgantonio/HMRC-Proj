package com.hmrc.baseclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.hmrc.settings.BrowserSetting;
import com.hmrc.settings.BrowserType;

public class BaseClass {

	static WebDriver driver;

	public static WebDriver baseDriver() throws InterruptedException {
		final String baseUrl = "http://localhost:3003";
		driver = BrowserSetting.InitBrowser(BrowserType.Firefox);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
