package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Demosalesmanager");
		// Creates password
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		// Clicks login button
		WebElement btn = driver.findElement(By.xpath("//input[@id='password']//following::input "));
		btn.click();
		// xpath to click the CRM/SFA link, leads and find leads
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		link.click();
		WebElement leads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		leads.click();
		WebElement findLeads = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLeads.click();
		
		//Clicks on name tab,enters lead ID,clicks on find button
		WebElement nameID = driver.findElement(By.xpath("//span[text()='Name and ID']"));
		nameID.click();
		WebElement leadID = driver.findElement(By.xpath("//input[@name='id']"));
		leadID.sendKeys("10463");
		WebElement findBtn = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findBtn.click();
		Thread.sleep(3000);
		WebElement fstLead = driver.findElement(By.xpath("//a[text()='10463']"));
		fstLead.click();
		
		//Deletes the enter lead ID,finds leads again and captures the results
		WebElement delBtn = driver.findElement(By.xpath("//a[text()='Delete']"));
		delBtn.click();
		WebElement findLeadsAgain = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLeadsAgain.click();
		WebElement leadIDAgain = driver.findElement(By.xpath("//input[@name='id']"));
		leadIDAgain.sendKeys("10463");
		WebElement findBtnAgain = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findBtnAgain.click();
		Thread.sleep(2000);
		
		//closes the browser
		driver.close();
		

	}

}
