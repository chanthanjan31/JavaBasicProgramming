package Week2.Day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://leafground.com/pages/Button.html");
			driver.findElementByXPath("//button[@id='home']").click();
			
			String title=driver.getTitle();
			System.out.println(title);
			
			if(title.contains("TestLeaf - Selenium Playground")) {
				System.out.println("click action is performed");
			}else {
				System.out.println("click action is not performed");
			}
			driver.navigate().back();
			Thread.sleep(3000);
			
			WebElement position= driver.findElementByXPath("//button[text()='Get Position']");
			System.out.println(position.getLocation());
			
			WebElement color= driver.findElementByXPath("//button[text()='What color am I?']");
			System.out.println(color.getCssValue("color"));
			
			WebElement dimension= driver.findElementByXPath("//button[text()='What color am I?']");
			System.out.println(dimension.getSize());
		

	}

}
