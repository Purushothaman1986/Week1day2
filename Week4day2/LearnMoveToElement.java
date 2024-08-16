package Week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMoveToElement {

	public static void main(String[] args) {
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(cp);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		WebElement mo = driver.findElement(By.xpath("//span[text()='MEN']"));
		
		Actions opt=new Actions(driver);
		opt.moveToElement(mo).perform();
		
	}

}