package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookUsingSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	      ChromeDriver driver=new ChromeDriver();
	      //load the url
	      driver.get("https://www.facebook.com");
	      driver.manage().window().maximize();
	      // create new acc
	      driver.findElement(By.linkText("Create new account")).click();
	      // enter the first name
	      driver.findElement(By.name("firstname")).sendKeys("Kirthi");
	      // enter the surname
	      driver.findElement(By.name("lastname")).sendKeys("kumar");
		// enter the mob no: or eml add
	      driver.findElement(By.name("reg_email__")).sendKeys("kk@gmail.com");
	      // enter the new pwd
	      driver.findElement(By.name("reg_passwd__")).sendKeys("kkm123");
	      
	      // handle three DD
	      // select by value
	      WebElement dayDD=driver.findElement(By.id("day"));
	      Select Select = new Select(dayDD);
	      Select.selectByValue("31");
	      // select by visibletext
	      WebElement monthDD=driver.findElement(By.id("month"));
	      Select Select1 = new Select(monthDD);
	      Select1.selectByVisibleText("Aug");
	      // select by visibletext
	      WebElement yearDD=driver.findElement(By.id("year"));
	      Select Select2 = new Select(yearDD);
	      Select2.selectByVisibleText("2001");
	      // radio button in gender
	      WebElement radiobutton=driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
			radiobutton.click();
	      
	      
	      
	      
	      
	}

}
