package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

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
		// create account name
		driver.findElement(By.id("accountName")).sendKeys("Creation");
		// enter the description
		driver.findElement(By.name("description")).sendKeys("Selenium automation tester");
		//create number of employees
		driver.findElement(By.name("numberEmployees")).sendKeys("4");
		//give site name
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		// create account
		driver.findElement(By.id("ext-gen612")).click();

	}

}
