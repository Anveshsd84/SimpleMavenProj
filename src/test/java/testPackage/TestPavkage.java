package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestPavkage {

	@Test
	public void openBrowser(){
		String current = System.getProperty("user.dir");
		
		
	//	System.setProperty("webdriver.chrome.driver", current+"/SimpleMavenProj/chromedriver");
	//	System.setProperty("webdriver.chrome.driver", current+"/SimpleMavenProj/chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", current+"//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/SimpleMavenProject/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

     
		
		driver.get("https://www.redbus.in");
		System.out.println("Title is "+driver.getTitle());
	}
	
}
