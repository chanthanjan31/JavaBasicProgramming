package Week2.Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
ChromeDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://leaftaps.com/opentaps/control/main");

WebElement username = driver.findElementById("username");

username.sendKeys("demosalesmanager");

driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();

		driver.close();

	}

}
