package Week2.Day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement ele= driver.findElementByXPath("//select[@id='dropdown1']");
		Select select=new Select(ele);
		select.selectByIndex(1);
		
		WebElement ele1= driver.findElementByXPath("//select[@name='dropdown2']");
		Select select1=new Select(ele1);
		select1.selectByVisibleText("Appium");
		
		WebElement ele2= driver.findElementByXPath("//select[@name='dropdown3']");
		Select select2=new Select(ele2);
		select2.selectByValue("3");
		
		WebElement ele3= driver.findElementByXPath("//select[@class='dropdown']");
		Select select3=new Select(ele3);
		List<WebElement> str=select3.getOptions();
		
		for(int i=1;i<str.size();i++) {
			System.out.println(str.get(i).getText());
		}
		
		WebElement ele4= driver.findElementByXPath("(//select)[5]");
		ele4.sendKeys("UFT/QTP");
		
		WebElement ele5= driver.findElementByXPath("(//select)[6]");
		Select select5=new Select(ele5);
		select5.selectByVisibleText("Selenium");
		select5.selectByVisibleText("Appium");
		select5.selectByVisibleText("Loadrunner");
		select5.deselectByVisibleText("Appium");
	}

}
