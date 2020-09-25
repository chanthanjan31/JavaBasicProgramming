package Week2.Day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/");
		//input[@type= 'password']
		
		driver.findElementByXPath("//h5[@class= 'wp-categories-title']").click();
		driver.findElementById("email").sendKeys("chanthanjan31@gmail.com");
		//driver.findElementById("username").sendKeys("chanthanjan31");
		// WebElement element = driver.findElementByXPath("//tagName[text() = 'text']");
		//WebElement webElement = driver.findElementByXPath("//input[@type= 'text']");
		//form[@id='login']/p[@class='top']
		//Enter the xpath or ID.

		     //webElement.sendKeys("chanthanjan31");
		//Input the string to pass.

		    // webElement.sendKeys(Keys.TAB);
		//This will enter the string which you want to pass and will press "Tab" button .
		//String username = driver.findElementByName("username").getAttribute("value");
		//System.out.println(username);
		//driver.findElementByName("username").clear();
		
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("chanthanjan31@gmail.com");
		
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("value"+Keys.TAB);
		
		String element=	driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value");
		System.out.println(element);
		
		WebElement clearEle=driver.findElementByXPath("//input[@value='Clear me!!']");
		clearEle.clear();
				
		Boolean value=driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(value);
		
	}
}
