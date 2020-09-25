package Week2.Day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.findElementByXPath("//label[@for='home']/following-sibling::img").click();
		driver.navigate().to("http://leafground.com/pages/Image.html");
		
		WebElement ele	=driver.findElementByXPath("//label[@for='position']/following-sibling::img");
		if(ele.getAttribute("naturalWidth").equals("0")) {
			 System.out.println("The image is Broken");
		}else {
			System.out.println("The image is not broken");
		}
		Thread.sleep(3000);
		
		driver.findElementByXPath("//img[@src='../images/keyboard.png']").click();
		driver.navigate().to("http://leafground.com/pages/Image.html");
	}

}
