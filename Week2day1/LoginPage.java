package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {

		//import not show means -ctrl+shift+o
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		//to pass value to webpage -> sendKeys()
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	//driver.findElement(By.partialLinkText("CRM")).click();
	
	//NoSuchElementException -if we have mismatch the value for the locators
	//InvalidSelectorException - syntax mistake 
	}

}