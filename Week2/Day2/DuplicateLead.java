package Week2.Day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		Thread.sleep(3000);
		
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("chanthan@gmail.com");
		
		driver.findElementByXPath("//button[text()='Find Leads']/ancestor::tbody").click();
		Thread.sleep(3000);
		
		String ele=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		System.out.println(ele);
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a").click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		  driver.findElementByXPath("//input[@value='Create Lead']").click();
		  Thread.sleep(3000);
		  
		  String str=driver.findElementById("viewLead_firstName_sp").getText();
		  if(str.equals(ele)) {
			  System.out.println("Lead is Duplicated");
		  }else {
			  System.out.println("Lead is not Duplciated");
		  }
		  driver.close();
	}


}
