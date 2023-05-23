package week4.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {public static void main(String[] args) throws InterruptedException {

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login/");
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("DemoSalesManager");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	WebElement LoginButton = driver.findElement(By.className("decorativeSubmit"));
	LoginButton.click();
	WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
	crmsfa.click();
	WebElement LeadsTap = driver.findElement(By.linkText("Leads"));
	LeadsTap.click();
	WebElement createLead = driver.findElement(By.linkText("Create Lead"));
	createLead.click();
	WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	CompanyName.sendKeys("Testleaf");
	WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
	FirstName.sendKeys("vik");
	WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
	LastName.sendKeys("ram");
	WebElement FirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	FirstNameLocal.sendKeys("V");
	WebElement deparmentName = driver.findElement(By.id("createLeadForm_deparmentName"));
	deparmentName.sendKeys("Tester");
	WebElement descriptionBox = driver.findElement(By.id("createLeadForm_descriptionBox"));
	descriptionBox.sendKeys("Identifying and reporting issues bugs and defects");
	WebElement primaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
	primaryEmail.sendKeys("vikramwin2002@gmail.com");
	WebElement createLeadButton=driver.findElement(By.className("smallSubmit"));
	createLeadButton.click();
	Thread.sleep(3000);
	driver.close();

}

}
