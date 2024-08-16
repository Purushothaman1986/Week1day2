package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");

		//store the syntax in webelement
		//webelement - to reuse the data multiple times if its needed
		//ctrl+2 => choose the 2nd option 
		
		//return type for findElement() -> WebElement
		WebElement dd = driver.findElement(By.className("ui-selectonemenu"));
	
		//create object Select class
		Select opt=new Select(dd);
		//object.method()
		
		//opt.selectByIndex(3);
		//index it will start from 0
		
		opt.selectByVisibleText("Selenium");
		Thread.sleep(3000);
		opt.selectByVisibleText("Playwright");
	
	}

}