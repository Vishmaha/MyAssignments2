package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Login Page:		
		WebElement username = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
		password.sendKeys("crmsfa");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='password']//following::input"));
		loginBtn.click();
        //Click CRM Link
		WebElement link = driver.findElement(By.xpath("//div[@id='label']/a"));
		link.click();
        //Click Lead Tab
		WebElement leads = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		leads.click();
		//Create Lead	
		WebElement cmpyName= driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		cmpyName.sendKeys("TestLeaf"); 
		WebElement fstName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		fstName.sendKeys("Vishali");
		WebElement lastName = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys("Maha");
		WebElement localName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
		localName.sendKeys("Leaftaps");
		WebElement deptName = driver.findElement(By.name("departmentName"));
		deptName.sendKeys("Automation");
		WebElement descp = driver.findElement(By.id("createLeadForm_description"));
		descp.sendKeys("Automation Learning");
		WebElement email = driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
		email.sendKeys("vishali@gmail.com");
		
		//SelectByValue	for selecting State
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stname = new Select(state);
		stname.selectByValue("NY");
		
		//Click Create
		WebElement btn = driver.findElement(By.xpath("//input[@name='submitButton']"));
		btn.click();
		//Click Edit		
		WebElement editBtn = driver.findElement(By.xpath("//a[text()='Edit']"));
		editBtn.click();
		//Clears Description
		WebElement descpClear = driver.findElement(By.id("updateLeadForm_description"));
		descpClear.clear();
		WebElement impNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		impNote.sendKeys("Important note");
				
		WebElement subBtn = driver.findElement(By.xpath("//input[@name='submitButton']"));
		subBtn.click();

		//Prints page title
		String title = driver.getTitle();
		System.out.println(title);

		// closes the browser
		driver.close();

	}

}