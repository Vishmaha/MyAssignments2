package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		// Creates username 
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Demosalesmanager");
		// Creates password
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		// Clicks login button
		WebElement btn = driver.findElement(By.xpath("//input[@id='password']//following::input "));
		btn.click();
		// xpath to click the CRM/SFA link
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		link.click();
		// xpath to click the Accounts tab
		WebElement accounts = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
		accounts.click();
		// Clicks on create acc button
		WebElement crtacc = driver.findElement(By.xpath("//a[contains(text(),'Create Account')] "));
		crtacc.click();
		// Enters a acc name
		String accname1 = "Testleaflearning9";
		WebElement accname = driver.findElement(By.id("accountName"));
		accname.sendKeys(accname1);
		// Enters the description
		WebElement description = driver.findElement(By.xpath("//textarea[contains(@class,'inputBox')]"));
		description.sendKeys("Selenium Automation Tester.");
		Thread.sleep(2000);
		// Select industry dropdown 
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		// Creates object for select class
		Select industryDrpdown = new Select(industry);
		// selects the given option
		industryDrpdown.selectByIndex(2);	
		// Select ownership dropdown 
		WebElement ownership = driver.findElement(By.xpath("//select[contains(@name,'ownershipEnumId')] "));
		// Creates object for select class
		Select ownershipDrpdown = new Select(ownership);
		// selects the given option
		ownershipDrpdown.selectByVisibleText("S-Corporation");
		// Select source dropdown 
		WebElement source = driver.findElement(By.id("dataSourceId"));
		// Creates object for select class
		Select sourceDrpdown = new Select(source);
		// selects the given option
		sourceDrpdown.selectByValue("LEAD_EMPLOYEE");
		// Select marketing dropdown 
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		// Creates object for select class
		Select marketingDrpdown = new Select(marketing);
		// selects the given option
		marketingDrpdown.selectByIndex(5);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateDrpdown = new Select(state);
		stateDrpdown.selectByValue("TX");
		Thread.sleep(2000);
		// Clicks on create acc button
		WebElement crtbtn = driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]"));
		crtbtn.click();
		//prints acc name
		WebElement getName = driver.findElement(By.xpath("//span[text()='Account Name']/following::span[@class='tabletext']"));
		String name = getName.getText();
		System.out.println(name);
		WebElement printName = driver.findElement(By.xpath("//span[contains(text(),'"+accname1+"')] "));
		String name1 =printName.getText();
		//System.out.println("Account name : " +name1);
	    if(name1.contains(accname1)) {
	    	System.out.println("Name matchs");
	    		
	    	}
	    	else {
	    		System.out.println("Name doesn't match");
	    }
	   
		Thread.sleep(2000);
		driver.close();
	}

}

