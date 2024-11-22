package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators_CreateAcc {

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
		WebElement accname = driver.findElement(By.id("accountName"));
		accname.sendKeys("TestLeaf55555");
		// Enters the description
		WebElement description = driver.findElement(By.xpath("//textarea[contains(@class,'inputBox')]"));
		description.sendKeys("Selenium Automation Tester.");
		// Enters no.of employees
		WebElement emp = driver.findElement(By.id("numberEmployees"));
		emp.sendKeys("50");
		// Enters the site name
		WebElement site = driver.findElement(By.id("officeSiteName"));
		site.sendKeys("LeafTaps");
		Thread.sleep(5000);
		// Clicks on create acc button
		WebElement crtbtn = driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]"));
		crtbtn.click();
		Thread.sleep(5000);
		// Prints the title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is : " + pageTitle);
		// Closes the browser
		driver.close();

	}

}
