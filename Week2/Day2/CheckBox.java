package Week2.Day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElementByXPath("//div[@class='example']//input").click();
		driver.findElementByXPath("//div[text()='SQL']//input").click();
		driver.findElementByXPath("//div[text()='C']//input").click();
		
		Thread.sleep(2000);
		
		
		//label[@for='username']/following::label
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input[1]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input[2]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input[3]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input[4]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input[5]").click();
		
		//form[@id='login']/p[@class='top']
		Boolean select=driver.findElementByXPath("//div[text()='Selenium']/input[@checked=\"\"]").isSelected();
		System.out.println(select);
		
		//label[@for='username']/following::label
		driver.findElementByXPath("//label[text()='DeSelect only checked']/following::input[2]").click();
	}

}
