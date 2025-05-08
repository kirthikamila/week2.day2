package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateTLAccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// create user name and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// enter login
		driver.findElement(By.className("decorativeSubmit")).click();
	
			// create crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		// create account
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		// create acc name
		driver.findElement(By.id("accountName")).sendKeys("Creation");
		// enter
		driver.findElement(By.name("description")).sendKeys("Selenium automation tester");
		driver.findElement(By.name("industryEnumId")).sendKeys("Computer Software");
		// select by visible text
			WebElement ownershipDD=driver.findElement(By.name("ownershipEnumId"));
			Select owneshipDD=new Select (ownershipDD);
			owneshipDD.selectByVisibleText("S-Corporation");
			//select by value
			   WebElement employee=driver.findElement(By.name("dataSourceId"));
			   Select employeeDD=new Select (employee);
			   employeeDD.selectByValue("LEAD_EMPLOYEE");
			
			//select by index
				WebElement MarketingCampaign=driver.findElement(By.name("marketingCampaignId"));
				Select marketingCampaignIdDD=new Select (MarketingCampaign);
				marketingCampaignIdDD.selectByIndex(6);
				
			//select by value
				WebElement StateorProvince=driver.findElement(By.name("generalStateProvinceGeoId"));
				Select StateorProvinceDD=new Select (StateorProvince);
				StateorProvinceDD.selectByValue("TX");
				
				driver.findElement(By.id("ext-gen609")).click();
				driver.close();		
			}
}

			
		
		
