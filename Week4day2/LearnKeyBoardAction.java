package Week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnKeyBoardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.amazon.in");

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
/*
 * WebElement keyvalue = driver.findElement(By.xpath("//span[text()='Click']"));
 * 
 * Actions opt=new Actions(driver);
 * opt.contextClick(keyvalue).pause(5000).keyDown(Keys.DOWN).keyUp(Keys.DOWN).
 * perform();
 */
	
	
	}

}