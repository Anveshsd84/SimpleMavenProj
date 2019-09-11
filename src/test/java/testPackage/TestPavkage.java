package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestPavkage {

	@Test
	public void openBrowser(){
		String current = System.getProperty("user.dir");
		//DesiredCapabilities capability = DesiredCapabilities.chrome();
		
		
		
		System.setProperty("webdriver.chrome.driver", current+"/SimpleMavenProj/chromedriver");
		WebDriver driver=new ChromeDriver();

     
		
		driver.get("https://www.redbus.in");
		System.out.println("Title is "+driver.getTitle());
	}
	
}
