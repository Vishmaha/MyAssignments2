package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class FaceboobSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//Add implicit wait for elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click on 'Create new account' button
        WebElement createAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccountButton.click();
        //Enter First name
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("John");
        //Enter Surname
        WebElement surname = driver.findElement(By.name("lastname"));
        surname.sendKeys("Doe");
        //Enter Mobile number or email address
        WebElement mobileOrEmail = driver.findElement(By.name("reg_email__"));
        mobileOrEmail.sendKeys("john.doe@example.com");
        //Enter New password
        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("Password123");
        //Handle the dropdowns for Date of Birth (Day, Month, Year)
        WebElement bday = driver.findElement(By.name("birthday_day"));
        Select dayDropdown = new Select(bday);
        dayDropdown.selectByValue("15");  
        WebElement month = driver.findElement(By.name("birthday_month"));
        Select monthDropdown = new Select(month);
        monthDropdown.selectByValue("5");  
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select yearDropdown = new Select(year);
        yearDropdown.selectByValue("1993"); 
        //Select gender radio button (Male)
        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='2']"));
        maleRadioButton.click();  
        
        //Close the browser after completion
        driver.close();
        
		

	}

}
