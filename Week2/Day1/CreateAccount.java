package Week2.Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElementByLinkText("Accounts").click();
	    Thread.sleep(3000);
	    
	    driver.findElementByLinkText("Create Account").click();
	    Thread.sleep(3000);
	    
	    driver.findElementById("accountName").sendKeys("Testing");
	    driver.findElementByName("description").sendKeys("Senior Analyst");
	    driver.findElementByName("groupNameLocal").sendKeys("Interview");
	    driver.findElementById("officeSiteName").sendKeys("Accenture");
	    driver.findElementById("annualRevenue").sendKeys("600000");
	    WebElement element1=driver.findElementByName("industryEnumId");
        Select select1=new Select(element1);
        select1.selectByIndex(3);
        WebElement element2=driver.findElementByName("ownershipEnumId");
        Select select2=new Select(element2);
        select2.selectByVisibleText("S-Corporation");
        WebElement element3=driver.findElementById("dataSourceId");
        Select select3=new Select(element3);
        select3.selectByVisibleText("Employee");
        WebElement element4=driver.findElementById("marketingCampaignId");
        Select select4=new Select(element4);
        select4.selectByIndex(6);
        WebElement element5=driver.findElementById("generalStateProvinceGeoId");
        Select select5=new Select(element5);
        select5.selectByVisibleText("Texas");
	    driver.findElementByClassName("smallSubmit").click();
	    System.out.println(driver.getTitle());
	    driver.close();
	}

}
