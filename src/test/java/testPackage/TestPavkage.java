package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestPavkage {

	@Test
	public void openBrowser(){
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\FleetainWorkSpace\\SimpleMavenProj\\chromedriver.exe");

      //  driver = new RemoteWebDriver(new URL("http://192.168.4.52:4444/wd/hub"), capability);
		
		driver.get("https://www.redbus.in");
		System.out.println("Title is "+driver.getTitle());
	}
	
}
