package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators_CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
        //Creates username 
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Demosalesmanager");
        //Creates password 
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
        //Clicks login button
		WebElement btn = driver.findElement(By.xpath("//input[@id='password']//following::input "));
		btn.click();
        //xpath to click the CRM/SFA link
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		link.click();
        //xpath to click on leads tab
		WebElement leads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		leads.click();
        //xpath to click on Create Lead button
		WebElement crtLead = driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));
		crtLead.click();
        //To enter the fields
		WebElement cmpName = driver.findElement(By.id("createLeadForm_companyName"));
		cmpName.sendKeys("Testleaf");
		WebElement fstName = driver.findElement(By.id("createLeadForm_firstName"));
		fstName.sendKeys("Vishali");
		WebElement lstName = driver.findElement(By.id("createLeadForm_lastName"));
		lstName.sendKeys("M");
		WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		title.sendKeys("Create Lead");
		Thread.sleep(5000);
        //xpath to click on Create Lead button
		WebElement crtBtn = driver.findElement(By.xpath("//input[contains(@class,'Submit')]"));
		crtBtn.click();
        //Prints the title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is : " + pageTitle);
        //Closes the browser
		driver.close();
	}

}
