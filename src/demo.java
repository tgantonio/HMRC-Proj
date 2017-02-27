import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/timmy/Downloads/Jars/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:3003");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[1]/nav/div[1]/ul/li[2]/a")).click();
	}

}
