package Week2.Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadCreate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		WebElement username = driver.findElementById("username");

		username.sendKeys("demosalesmanager");

		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
        driver.findElementByLinkText("Leads").click();
        
        driver.findElementByLinkText("Create Lead").click();
        
        Thread.sleep(1000);
        
        driver.findElementById("createLeadForm_companyName").sendKeys("Accenture");
        
        driver.findElementById("createLeadForm_firstName").sendKeys("Chanthan");
        
        driver.findElementById("createLeadForm_lastName").sendKeys("Babbu");
        
        WebElement element=driver.findElementById("createLeadForm_dataSourceId");
        
        Select select=new Select(element);
        
        select.selectByVisibleText("Conference");
        
        WebElement element1=driver.findElementById("createLeadForm_marketingCampaignId");
        
        Select select1=new Select(element1);
        
        select1.selectByValue("9001");
        
        WebElement element2=driver.findElementById("createLeadForm_industryEnumId");
        Select select2=new Select(element2);
        
        select2.selectByIndex(15);
        
        WebElement element3=driver.findElementById("createLeadForm_ownershipEnumId");
        
        Select select3=new Select(element3);
        
        select3.selectByIndex(5);
        
        WebElement element4=driver.findElementById("createLeadForm_generalCountryGeoId");
        
        Select select4=new Select(element4);
        
        select4.selectByVisibleText("India");
        
        driver.findElementByName("submitButton").click();
        
        String title=driver.getTitle();
        
        System.out.println(title);
        
        if(driver.getTitle().contains("View Lead | opentaps CRM")) {
        	
        	System.out.println("Title is verified as expected ");
        	
        }else {
        	
        	System.out.println("Title is not verified as expected");
        	
        }
	}

}
