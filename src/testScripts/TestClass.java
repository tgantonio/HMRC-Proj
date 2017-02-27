package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hmrc.baseclasses.BaseClass;
import com.hmrc.data.Entry;
import com.hmrc.pageclasses.LandingPage;
import com.hmrc.pageclasses.LoginPage;

public class TestClass {
	WebDriver driver;
	
	LoginPage logPage;
	LandingPage landPage;
	
	
	

	
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		
		driver = BaseClass.baseDriver();
		
		logPage = new LoginPage(driver);
		landPage = new LandingPage(driver);
		
		logPage = landPage.navigateToLoginPage();
		logPage.doLogin();
		Assert.assertTrue(landPage.logout!= null);
		

		
		
	}
	

	
	@DataProvider(name="Inputs")
	public static Object[][] createMultiple(){
		
		return Entry.createMultipleEntries();
		
	}

	@Test(dataProvider="Inputs")
	public void testMulitpleEntries(String hotel, String address, String owner, String phoneNumber, String email) throws InterruptedException {
		
		if (logPage.loginButton.isDisplayed()) {
			logPage.doLogin();
		}
		
		landPage.hotelNameBox.sendKeys(hotel);
		landPage.addressBox.sendKeys(address);
		landPage.ownerBox.sendKeys(owner);
		landPage.phoneNumberBox.sendKeys(phoneNumber);
		landPage.emailBox.sendKeys(email);
		landPage.createButton.click();
		landPage.clearFeilds();
		
		
	}

	@Test
	public void testSingleEntry() throws InterruptedException{
				
		landPage.hotelNameBox.sendKeys("Hotel100");
		landPage.addressBox.sendKeys("my address");
		landPage.ownerBox.sendKeys("tim");
		landPage.phoneNumberBox.sendKeys("1233223");
		landPage.emailBox.sendKeys("test@email.net");
		landPage.createButton.click();
		
		
	}
	

	
	@AfterClass
	public void afterClass() throws InterruptedException {
		landPage.logout.click();
		Thread.sleep(3000);
		driver.quit();		
	}

}
