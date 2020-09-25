package Week2.Day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Link.html");	
		driver.findElementByLinkText("Go to Home Page").click();
		
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("TestLeaf - Selenium Playground")) {
			System.out.println("click action is performed");
		}else {
			System.out.println("click action is not performed");
		}
		
		driver.findElementByXPath("//a[@href='pages/Link.html']").click();
		
		driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
		
		driver.navigate().back();
		
		WebElement ele=driver.findElementByLinkText("Find where am supposed to go without clicking me?");
		
		String str=ele.getAttribute("href");
		
		System.out.println(str);
		
		WebElement clk=driver.findElementByLinkText("Verify am I broken?");
		
		clk.click();
		
		String name=driver.getTitle();
		
		if(name.contains("404")) {
			System.out.println("Page is redirected to Page not found - Error Page");
		}else {
			System.out.println("Page is not redirected to Page not found - Error Page");
		}
		
		driver.navigate().back();
		
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a").click();
	}

}
