package Week2.Day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//div[@class='x-tab-panel-body x-tab-panel-body-top']//input[@name='firstName']").sendKeys("CHANTHAN");
		driver.findElementByXPath("//button[text()='Find Leads']/ancestor::tbody").click();
		Thread.sleep(3000);

		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[text()='CHANTHAN']").click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		driver.findElementByXPath("//a[text()='Qualify Lead']/following-sibling::a").click();

		driver.findElementById("updateLeadForm_companyName").clear();
		
		driver.findElementById("updateLeadForm_companyName").sendKeys("ACCENTURE");
		
		driver.findElementByXPath("//input[@name='submitButton'][@value='Update']").click();
		
		String ele1=driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		
		if(ele1.contains("ACCENTURE")) {
			System.out.println("Company name is verfied");
		}else {
			System.out.println("Company name is not verfied");
		}
		driver.close();
	}


}
