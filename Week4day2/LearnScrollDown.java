package Week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//Sell on Amazon
		WebElement sd = driver.findElement(By.linkText("Sell on Amazon"));
		
		Actions opt=new Actions(driver);
		opt.scrollToElement(sd).perform();
		Thread.sleep(3000);
		sd.click();
		
	}

}