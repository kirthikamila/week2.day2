package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {
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
		// create leads tab
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		// create company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		// create first and last name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kirthika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		// enter the title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("testleaftab");
		WebElement createLeadDD = driver.findElement(By.name("submitButton"));
        createLeadDD.click();
        // close the browser
        driver.close();
    
       
		
		

}
}

